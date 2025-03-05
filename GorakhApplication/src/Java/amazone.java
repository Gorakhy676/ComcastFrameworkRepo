package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazone {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone16&crid=2TK6Y0T0DW1MG&sprefix=iphone16%2Caps%2C305&ref=nb_sb_noss_2");
		List<WebElement> product=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		for(int i=0;i<product.size();i++) {
			System.out.println(product.get(i).getText());
		}
	}
}
