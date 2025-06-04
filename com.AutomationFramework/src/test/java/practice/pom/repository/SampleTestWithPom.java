package practice.pom.repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SampleTestWithPom {
	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	WebElement password;
	@FindBy(xpath="//input[@id='submitButton']")
	WebElement login;
	
	@Test
	public void sampleTest() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://49.249.28.218:8888/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SampleTestWithPom s=PageFactory.initElements(driver, SampleTestWithPom.class);
		
		s.username.sendKeys("admin");
		s.password.sendKeys("admin");
		
		
		
		driver.navigate().refresh();
		
		PageFactory.initElements(driver, SampleTestWithPom.class);

		s.username.sendKeys("admin");
		s.password.sendKeys("admin");
		s.login.click();
		
	}


}
