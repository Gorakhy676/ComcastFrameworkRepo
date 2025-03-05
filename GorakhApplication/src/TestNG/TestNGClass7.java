package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGClass7 {
	 @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite - Runs once before the suite starts");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class - Runs before the first test method in the class");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Before Method - Runs before each test method");
	    }

	    @Test
	    public void testCase1() {
	        System.out.println("Executing Test Case 1");
	    }

	    @Test
	    public void testCase2() {
	        System.out.println("Executing Test Case 2");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("After Method - Runs after each test method");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class - Runs after all test methods in the class");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite - Runs once after the suite ends");
	    }
	

}
