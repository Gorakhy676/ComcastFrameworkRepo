package practice.pom.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestWithoutPom {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://49.249.28.218:8888/");
		WebElement e1=driver.findElement(By.name("user_name"));
		WebElement e2=driver.findElement(By.name("user_password"));
		WebElement e3=driver.findElement(By.id("submitButton"));
		e1.sendKeys("admin");
		e2.sendKeys("admin");
		e3.click();
		System.out.println(e1);
		System.out.println(e2);
		
		driver.navigate().refresh();

		e1.sendKeys("admin");
		e2.sendKeys("admin");
		e3.click();
		System.out.println(e1);
		System.out.println(e2);
		

	}

}
