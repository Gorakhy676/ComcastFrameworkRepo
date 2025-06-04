package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateOrgTest1 {
	@Test
	public void createorgtest() throws Throwable {
		
		// read data from json file
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader("C:\\Users\\Admin\\Desktop\\data\\appCommonData.json"));

		//Step 2: convert java object into jsonobject using down casting 
		JSONObject map=(JSONObject)obj;
		
				String BROWSER =(String) map.get("browser").toString(); 
				String URL = (String) map.get("url").toString();
				String USERNAME = (String) map.get("username").toString();
				String PASSWORD =  (String) map.get("password").toString();
				
				//generate the random number
				Random random=new Random();
				int randomInt=random.nextInt(1000);
				
				//read testScript data from excel file
				FileInputStream fis1 = new FileInputStream("C:\\Users\\Admin\\Desktop\\excel.xlsx");
				Workbook wb=  WorkbookFactory.create(fis1);
				Sheet sheet=wb.getSheet("org");
				Row row= sheet.getRow(1);
				String organizationName=row.getCell(2).toString();
				 
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
				 
				  driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
				  WebElement orgname=driver.findElement(By.name("accountname"));
				  orgname.sendKeys(organizationName +randomInt);
				  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				  Thread.sleep(20);
				  Actions a=new Actions(driver);
				  
				  WebElement signout=driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]/.."));
				  a.moveToElement(signout).perform();
				  
				  
//				  WebElement signOutBtn = driver.findElement(By.linkText("Sign Out"));
				  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign Out")));
				  driver.findElement(By.linkText("Sign Out")).click();
			

		
	}
}
