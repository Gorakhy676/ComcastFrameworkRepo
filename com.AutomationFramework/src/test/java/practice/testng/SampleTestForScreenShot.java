package practice.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class SampleTestForScreenShot {

	@Test
	public void amazonTest() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		
		//step 1: create an object to eventfirirng webdriver
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		
		//step-2: use getScreenshotAs method to get file type of screenshot
		File src=edriver.getScreenshotAs(OutputType.FILE);
		
		//step 3: store screenshot in local drive
		FileUtils.copyFile(src, new File("./screenshot/test.png"));
		driver.close();
	}
}
