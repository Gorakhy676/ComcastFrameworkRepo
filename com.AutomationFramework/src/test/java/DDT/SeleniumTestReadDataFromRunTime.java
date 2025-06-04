package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestReadDataFromRunTime {

	@Test
	public void SeleniumTest() throws Throwable {
		//read common data from properties file
				FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\commondata.properties");
				Properties p = new Properties();
				p.load(fis);
				String BROWSER = p.getProperty("bro");
				String URL = p.getProperty("url");
				String USERNAME = p.getProperty("un");
				String PASSWORD = p.getProperty("pwd");
		
		
		WebDriver driver=null;
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}

		
		  	
		  driver.get(URL);
		  driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		  driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		  driver.findElement(By.id("submitButton")).click(); 
		  driver.findElement(By.xpath("//td[@class='tabUnSelected' and contains(.,'Organizations')]")).click();
		  
		  driver.close();
	}
	

}
