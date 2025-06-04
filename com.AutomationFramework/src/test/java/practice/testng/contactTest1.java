package practice.testng;

import org.testng.annotations.Test;

public class contactTest1 {
	@Test(invocationCount=10)
	public void createContact()
	{
		System.out.println("exicute create contact with hdfc");
	}
	
	@Test(dependsOnMethods = "createContact")
	public void modifyContact()
	{
		System.out.println("modify contact  test hdfc>>  icici");
	}
	
	@Test(enabled=false)
	public void deleteContact()
	{
		System.out.println("delete contact  test icici");
	}

}
