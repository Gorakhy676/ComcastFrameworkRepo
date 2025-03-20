package SeleniumFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandAloneTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/client");
		WebElement un=driver.findElement(By.id("userEmail"));
		un.sendKeys("seleniumg@gmail.com");
		WebElement pwd=driver.findElement(By.id("userPassword"));
		pwd.sendKeys("Selenium@123");
		driver.findElement(By.id("login")).click();
		List<WebElement> product= driver.findElements(By.xpath("//div[@class='card-body']"));
		for(WebElement x:product) {
			System.out.println(x.getText());
		}
	}

}
