package practice.test;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;

public class GetProductInfoTest {
	@Test(dataProvider = "getData")
	public void getProductInfoTest(String brandName,String productName) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://flipkart.in");
		//search product
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(brandName,Keys.ENTER);
		//capture product information
		String x="//div[@class='tUxRFH' and contains(., '"+productName+"')]//div[@class='Nx9bqj _4b5DiR']";
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
		driver.quit();
	}
	@DataProvider
	public Object[][] getData() throws Throwable {
		ExcelUtility elib=new ExcelUtility();
		int rowCount=elib.getRowCount("product");
		Object[][] objArr=new Object[rowCount][2];
	    for (int i = 0; i < rowCount; i++) {
	        objArr[i][0] = elib.getDataFromExcel("product", i + 1, 0);
	        objArr[i][1] = elib.getDataFromExcel("product", i + 1, 1);
	    }
		
//		objArr[1][0]="iphone";
//		objArr[1][1]="Apple iPhone 15 (Black, 128 GB)";
//		objArr[2][0]="iphone";
//		objArr[2][1]="Apple iPhone 16 (Teal, 256 GB)";
		
		return objArr;
		
	}
	
	
	
	
	
	
	
	
}
