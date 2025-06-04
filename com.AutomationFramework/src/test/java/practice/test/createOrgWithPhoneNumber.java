package practice.test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.webdriverutility.JavaUtility;
import com.comcast.crm.webdriverutility.WebDriverUtility;

public class createOrgWithPhoneNumber {
	public static void main(String[] args) throws Throwable {
		//read common data from properties file
		FileUtility flib=new FileUtility();
		ExcelUtility elib=new ExcelUtility();
		JavaUtility jlib=new JavaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		
		String BROWSER = flib.getDataFromPropertiesFile("bro");
		String URL = flib.getDataFromPropertiesFile("url");
		String USERNAME =flib.getDataFromPropertiesFile("un");
		String PASSWORD =flib.getDataFromPropertiesFile("pwd");
		
	
		String orgName=elib.getDataFromExcel("org", 4, 2)+ jlib.getRandomNumber();
		String phoneNumber=elib.getDataFromExcel("org", 7, 3)+ jlib.getRandomNumber();
		
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

		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(URL);
		  LoginPage lp=new LoginPage(driver);
		  lp.loginToApp("admin","admin");
		  driver.findElement(By.xpath("//td[@class='tabUnSelected' and contains(.,'Organizations')]")).click();
		 
		  driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		  driver.findElement(By.name("accountname")).sendKeys(orgName);
		  driver.findElement(By.id("phone")).sendKeys(phoneNumber);
		  			  
		
		 
		  
		  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		  
		  //verify the phoneNumber
		  
		String actPhoneNumber =  driver.findElement(By.id("dtlview_Phone")).getText();
		  if(actPhoneNumber.contains(phoneNumber)) {
			  System.out.println(phoneNumber+" information is verified");
		  }
		  else {
			  System.out.println(phoneNumber+" information is  not verified");
		  }
		  
			
		  
		  
		 driver.quit();
}


}
