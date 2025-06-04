package practice.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.OrganizationInfoPage;
import com.comcast.crm.objectrepositoryutility.OrganizationsPage;
import com.comcast.crm.webdriverutility.JavaUtility;
import com.comcast.crm.webdriverutility.WebDriverUtility;

public class DeleteOrgTest {
	
	public static void main(String[] args) throws Throwable {
		
		FileUtility flib=new FileUtility();
		ExcelUtility elib=new ExcelUtility();
		JavaUtility jlib=new JavaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		
		String BROWSER = flib.getDataFromPropertiesFile("bro");
		String URL = flib.getDataFromPropertiesFile("url");
		String USERNAME = flib.getDataFromPropertiesFile("un");
		String PASSWORD = flib.getDataFromPropertiesFile("pwd");
		
		
		String orgName=elib.getDataFromExcel("org", 10, 2)+ jlib.getRandomNumber();
		  System.out.println(orgName);
		  
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
		  	
		  	//login to app
		  driver.get(URL);
		
		 LoginPage lp=new LoginPage(driver);
		 lp.loginToApp("admin", "admin");
		  
		  
		  //navigate to organisation module
		 HomePage hp=new HomePage(driver);
		 hp.getOrgLink().click();
		 
		 
		 //click on create organisation button
		 OrganizationsPage op=new OrganizationsPage(driver);
		 op.getCreateNewOrgBtn().click();
		  
		  //enter all the details and ceate new organisation
		 CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		 cnop.createOrg(orgName);
		 cnop.getSavebtn().click();
		 
		  
		  //verify Header msgExpected Result
		
		 OrganizationInfoPage oip=new OrganizationInfoPage(driver);
		String actOrgName= oip.getHeaderVerify().getText();
		
		 if(actOrgName.contains(orgName)) {
			  System.out.println(orgName+"is verified==Pass");
		  }
		  else {
			  System.out.println(orgName+"is not verified== Fail");
		  }
		  
		 //go to back Organization page
		 hp.getOrgLink().click();
		
		 
		 //search for organization
		 op.getSearchEdit().sendKeys(orgName);
		 wlib.select(op.getSearchDD(), "Organization Name");
		 op.getSearchBtn().click();
		 
		 Thread.sleep(20);
		 
		 
		 //in dynamic webtable select  & delete org
		 
		 driver.findElement(By.xpath("//a[text()='"+orgName+"']/../../td[8]/a[text()='del']")).click();
		 
		// driver.findElement(By.xpath("//a[text()='del']")).click();
		 wlib.switchToAlertAndAccept(driver);
		 
		  //step 5 : logout
		 hp.getSignoutBtn();
		//driver.quit();

	}

}
