package practice.testng;

import org.testng.annotations.Test;

public class orderTest {

	@Test
	public void createOrderTest()
	{
		System.out.println("  execute create order test ===>123");
		String str=null;
		System.out.println(str.equals("123"));
	}
	
	@Test(dependsOnMethods = "createOrderTest")
	public void billingAnOrderTest()
	{
		System.out.println("  execute billing an order test ===>123");
	}
}
