package practice.testng;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(priority=2)
	public void login()
	{
		System.out.println("login test");
		System.out.println("exicute navigate to contact");
		System.out.println("exicute create contact");
		System.out.println("exicute  verify contact");
		System.out.println("exicute login");
	}
	@Test
	public void navigateToContactTest()
	{
		System.out.println("navigate to  test");
	}
	
	@Test
	public void createContact()
	{
		System.out.println("create contact  test");
	}
	
	@Test
	public void modifyContact()
	{
		System.out.println("modify contact  test");
	}
	
	@Test
	public void deleteContact()
	{
		System.out.println("delete contact  test");
	}

}
