package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class delhiMetro {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://delhimetrorail.com/");
		driver.findElement(By.xpath("//input[@id='FromStation']")).click();
		WebElement from=driver.findElement(By.xpath("//div[@class='popup-result-line red']/../."));
		from.click();
		driver.findElement(By.xpath("//div[text()='SHAHEED STHAL ( NEW BUS ADDA)']")).click();

	}

}
