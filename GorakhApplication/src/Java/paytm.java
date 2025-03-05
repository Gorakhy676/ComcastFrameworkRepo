package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.paytm.com/");
		driver.findElement(By.xpath("//span[text()='Trains']")).click();
		driver.findElement(By.xpath("//input[@id='sourceInput']")).click();
		driver.findElement(By.xpath("//div[text()='NDLS']")).click();
		driver.findElement(By.xpath("//input[@id='destinationInput']")).click();
		driver.findElement(By.xpath("//div[text()='HWH']")).click();
		driver.findElement(By.xpath("//div[text()='Wed']")).click();
		WebElement search=driver.findElement(By.xpath("//div[text()='Search Trains']"));
		search.click();
		Thread.sleep(5000);
		WebElement tatkal=driver.findElement(By.xpath("//span[text()='Tatkal']"));
		tatkal.click();
		WebElement wl=driver.findElement(By.xpath("//div[text()='WL 8']"));
		wl.click();
		WebElement cancle=driver.findElement(By.xpath("//img[@src='//travel-assets-akamai.paytm.com/travel/mweb-train/assets/d5078486.svg']"));
		cancle.click();
	
	}

}
