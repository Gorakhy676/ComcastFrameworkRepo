package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHRMConferm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("gorakhy");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("gorakh@123");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

	}

}
