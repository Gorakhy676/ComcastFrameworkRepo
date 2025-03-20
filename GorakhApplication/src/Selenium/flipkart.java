package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("iphone");
		WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']")).click();
		Thread.sleep(2000);
		 Set<String> windowHandles = driver.getWindowHandles();
	        String parentWindow = driver.getWindowHandle();

	        for (String window : windowHandles) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	        
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("201301");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		driver.findElement(By.xpath("//span[text()='GO TO CART']")).click();
	}

}
