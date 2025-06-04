package QSpider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo1 {

	public static void main(String[] args) {
		String monthAndYear="January 2026";
		int day=1;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='"+monthAndYear+"']/ancestor::div[@class='DayPicker-Month']//p[text()='"+day+"']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
		}

	}

}
