package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listners implements ITestListener {
	  @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test case started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {  // Fixed method name
	        System.out.println("Test case successful: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {  // Fixed method name
	        System.out.println("Test case failed: " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {  // Fixed method name
	        System.out.println("Test case skipped: " + result.getName());
	    }

	    @Test
	    public void test1() {
	        System.out.println("Executing test1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Executing test2");
	        int x = 1 / 0;  // This will cause a failure
	    }

	    @Test(dependsOnMethods = "test2")
	    public void test3() {
	        System.out.println("Executing test3"); // This will be skipped
	    }

}
