package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmFlight {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		WebElement flight=driver.findElement(By.xpath("//span[text()='Flights']"));
		flight.click();
		WebElement src=driver.findElement(By.xpath("//span[@id='srcCode']"));
		src.click();
		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		WebElement dest=driver.findElement(By.xpath("//span[@id='destCode']"));
		dest.click();
		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		driver.findElement(By.xpath("//span[text()='Sat, 08 Mar 25']")).click();
		WebElement searchflight=driver.findElement(By.xpath("//button[@id='flightSearch']"));
		searchflight.click();
	}

}
