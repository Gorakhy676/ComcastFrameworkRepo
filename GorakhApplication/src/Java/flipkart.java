package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=jeans&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		List<WebElement> product=driver.findElements(By.xpath("//div[@class='hCKiGj']"));
		for(int i=0;i<product.size();i++) {
			System.out.println(product.get(i).getText());
			//driver.close();
		}
	}

}
