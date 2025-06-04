package QSpider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
			driver.findElement(By.xpath("//button[@id='btn']")).click();
			driver.findElement(By.xpath("//button[@id='btn2']")).click();
			driver.findElement(By.xpath("//button[@id='btn8']")).click();
			driver.findElement(By.xpath("//a[text()='Default Click']")).click();

	}

}
