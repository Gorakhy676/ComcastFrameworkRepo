package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
		createAccount.click();
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("Gorakh");
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.sendKeys("Yadav");
		WebElement day=driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.selectByValue("4");
		WebElement month=driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByVisibleText("May");
		WebElement year=driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		WebElement number=driver.findElement(By.name("reg_email__"));
		number.sendKeys("9919049480");
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("Gorakh@123");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
