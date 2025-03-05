package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOrangehrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
		WebElement pimsearch=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		pimsearch.sendKeys("PIM");
		Thread.sleep(5000);
		WebElement pim=driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']/ancestor::div[@class='oxd-sidepanel-body']/descendant::a[@href='/web/index.php/pim/viewPimModule']"));
		pim.click();
		Thread.sleep(2000);
		WebElement addemp= driver.findElement(By.xpath("//a[text()='Add Employee']"));
		addemp.click();
		Thread.sleep(2000);
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		fname.sendKeys("Gorakh");
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastName']"));
		 lname.sendKeys("Yadav");
		WebElement createlogin= driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		createlogin.click();
		//label[text()='Username']/../following-sibling::div
		////input[@class='oxd-input oxd-input--active']/following::input[7]
		WebElement Username=driver.findElement(By.xpath("label[text()='Username']/../following-sibling::div"));
		Username.sendKeys("gorakhy");
		WebElement password=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']/following::input[10]"));
		password.sendKeys("gorakh@123");
		WebElement ConfermPassword=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']/following::input[11]"));
		ConfermPassword.sendKeys("gorakh@123");
		Thread.sleep(5000);
		WebElement save=driver.findElement(By.xpath("//button[text()=' Save ']"));
		save.click();
		
		
		//driver.close();
	}

}
