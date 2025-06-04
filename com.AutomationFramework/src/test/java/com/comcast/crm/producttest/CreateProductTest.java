package com.comcast.crm.producttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.webdriverutility.JavaUtility;

public class CreateProductTest {
	public static void main(String[] args) throws Throwable{
		FileUtility flib=new FileUtility();
		ExcelUtility elib=new ExcelUtility();
		JavaUtility jlib=new JavaUtility();
		String BROWSER = flib.getDataFromPropertiesFile("bro");
		String URL = flib.getDataFromPropertiesFile("url");
		String USERNAME = flib.getDataFromPropertiesFile("un");
		String PASSWORD = flib.getDataFromPropertiesFile("pwd");
		
		String orgName=elib.getDataFromExcel("org", 4, 2)+ jlib.getRandomNumber();
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
		  	
		  	 driver.get(URL);
			 LoginPage lp=new LoginPage(driver);
			 lp.loginToApp("admin", "admin");
			 driver.findElement(By.xpath("//a[text()='Products']")).click();
			 driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

	}

}
