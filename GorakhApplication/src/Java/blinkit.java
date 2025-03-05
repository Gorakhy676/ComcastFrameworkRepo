package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blinkit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/");
		WebElement a=driver.findElement(By.xpath("//div[text()='Mother Dairy Toned Milk']/ancestor::div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']/descendant::div[text()='ADD']"));
		a.click();
	
	}

}
