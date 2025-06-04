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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.webdriverutility.JavaUtility;

public class CreateOrganizationWithIndustriesTest extends BaseClass{

		public void createOrganizationWithIndustriesTest() throws Throwable {
			
			
		
			String orgName=elib.getDataFromExcel("org", 4, 2)+jlib.getRandomNumber();
			String industry=elib.getDataFromExcel("org", 4, 3);
			String type=elib.getDataFromExcel("org", 4, 4);
			 
			  LoginPage lp=new LoginPage(driver);
			  lp.loginToApp("admin", "admin");
			 
			  
			  driver.findElement(By.xpath("//td[@class='tabUnSelected' and contains(.,'Organizations')]")).click();
			 
			  driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			  driver.findElement(By.name("accountname")).sendKeys(orgName);
			  			  
			 WebElement webSel= driver.findElement(By.name("industry"));
			  Select sel=new Select(webSel);
					  sel.selectByVisibleText(industry);
					  
					  WebElement webSel1= driver.findElement(By.name("accounttype"));
					  Select sel1=new Select(webSel1);
							  sel1.selectByVisibleText(type);
			  
			 
			  
			  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			  
			  //verify the industry and typeinfo
			  
			String actIndustries =  driver.findElement(By.xpath("//span[@id='dtlview_Industry']/font")).getText();
			  if(actIndustries.contains(industry)) {
				  System.out.println(industry+"information is verified");
			  }
			  else {
				  System.out.println(industry+"information is  not verified");
			  }
			  
				String actType=  driver.findElement(By.id("dtlview_Type")).getText();
				  if(actType.contains(type)) {
					  System.out.println(type+"  information is verified");
				  }
				  else {
					  System.out.println(type+"  information is  notverified");
				  }
			
	}

}
