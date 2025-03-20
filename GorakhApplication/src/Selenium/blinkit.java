package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blinkit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.blinkit.com/");
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		Thread.sleep(4000);
		WebElement search=driver.findElement(By.xpath("SearchBar__Button-sc-16lps2d-4 fgHDQx"));
		search.click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("vegetables");
		Thread.sleep(2000);
		List<WebElement> allVegetables = driver
				.findElements(By.xpath("//div[@class='Product__UpdatedTitle-sc-11dk8zk-9 hxWnoO']"));
		Thread.sleep(2000);
		for (WebElement veg : allVegetables) {
			if (veg.getText().equals("Lady Finger (Bhindi)"))
			{
				veg.click();
				break;
			}
			
		}



	}

}
