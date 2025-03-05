package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		WebElement train=driver.findElement(By.xpath("//span[text()='Train Tickets']"));
		train.click();
		WebElement from=driver.findElement(By.xpath("//div[text()='From']"));
		from.click();
		driver.findElement(By.xpath("//div[text()='New Delhi']")).click();
		WebElement to=driver.findElement(By.xpath("//div[text()='To']"));
		to.click();
		driver.findElement(By.xpath("//div[text()='Mumbai Central']")).click();
		WebElement date=driver.findElement(By.xpath("//button[text()='Tomorrow']"));
		date.click();
		WebElement search=driver.findElement(By.xpath("//button[text()='Search Trains']"));
		search.click();
		driver.findElement(By.xpath("//span[text()='Available']")).click();
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		WebElement itctcId=driver.findElement(By.xpath("//input[@id='1']"));
		itctcId.click();
		
		WebElement usernameCheck=driver.findElement(By.xpath("//div[text()='CHECK USERNAME']"));
		usernameCheck.click();
	}

}
