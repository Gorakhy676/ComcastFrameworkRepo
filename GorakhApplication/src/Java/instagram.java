package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		WebElement phoneno=driver.findElement(By.name("username"));
		phoneno.sendKeys("9919049480");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Gorakh@7664");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search input']"));
		search.sendKeys("Rohit Yadav");
		
		
		
	}

}
