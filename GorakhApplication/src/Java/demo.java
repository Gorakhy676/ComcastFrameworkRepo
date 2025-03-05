package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	 
		public static void main(String[] args) {
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createaccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
		createaccount.click();
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("abc");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("abcde");
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		WebElement phone=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phone.sendKeys("9919049480");
		WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("abc@123");
		}

}
