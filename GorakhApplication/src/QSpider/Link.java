package QSpider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoapps.qspiders.com/ui/link/contact?sublist=0");
		
		
	}

}
