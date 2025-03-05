package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metro {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://delhimetrorail.com/");
		//driver.findElement(By.xpath("//input[@id='FromStation']"));
		
		
		
		
		
	}

}
