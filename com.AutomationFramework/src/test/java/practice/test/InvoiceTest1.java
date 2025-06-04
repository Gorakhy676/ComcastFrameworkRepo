package practice.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
//@Listeners(com.comcast.crm.listnerutility.ListnerImplementationClass.class)
public class InvoiceTest1  {
	
	@Test(retryAnalyzer = com.comcast.crm.listnerutility.RetryListnerImp.class)
	public void activateSim() {
		System.out.println("execute createInvoiceTest");
		
		Assert.assertEquals("", "Login");
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
		
		
	}
	
	
}
