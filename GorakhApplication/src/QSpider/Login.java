package QSpider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/login");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("syadav@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("syadav");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
