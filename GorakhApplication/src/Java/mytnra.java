package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mytnra {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.myntra.com/men-jeans");
		driver.get("https://www.myntra.com/jeans?rawQuery=jeans");
		List<WebElement> productName=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		 for(int i=0;i<productName.size();i++) {
			System.out.println(productName.get(i).getText());
		}
		
		

	}

}
