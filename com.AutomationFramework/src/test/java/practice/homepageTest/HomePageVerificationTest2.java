package practice.homepageTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

public class HomePageVerificationTest2 {

	@Test
	public void homePageTest(Method mtd) {
		SoftAssert assertObj = new SoftAssert();
				
		Reporter.log(mtd.getName() + "Test Start");
		Reporter.log("Step-1",true);
		Reporter.log("Step-2",false);
		assertObj.assertEquals("Home", "Home");
		Reporter.log("Step-3",true);
		assertObj.assertEquals("Home_CRM", "Home_CRM");
		Reporter.log("Step-4",true);
		assertObj.assertAll();

		Reporter.log(mtd.getName() + "Test end");
	}

	@Test
	public void verifyLogoHomePageTest(Method mtd) {
		SoftAssert assertObj = new SoftAssert();
		Reporter.log(mtd.getName() + "Test Start");
		Reporter.log("Step-1",true);
		Reporter.log("Step-2",true);
		assertObj.assertTrue(true);
		Reporter.log("Step-3",true);
		Reporter.log("Step-4",true);
		assertObj.assertAll();

		Reporter.log(mtd.getName() + "Test end");

	}
}
