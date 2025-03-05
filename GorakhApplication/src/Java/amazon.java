package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("jeans");
		WebElement searchclick=driver.findElement(By.id("nav-search-submit-button"));
		searchclick.click();
		driver.findElement(By.xpath("//span[text()='Men Jeans || Jeans for Men || Cargo Jeans (Q-04-05)']")).click();
		Thread.sleep(20);
		driver.findElement(By.id("buy-now-button")).click();
	}

}
