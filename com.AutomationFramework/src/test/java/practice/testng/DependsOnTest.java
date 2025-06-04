package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependsOnTest {
	@DataProvider
	public void test1()
	{
		System.out.println(" test case 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println(" test case 2");
	}
	@Test
	public void test3()
	{
		System.out.println(" test case 3");
	}
	@Test
	public void test4()
	{
		System.out.println(" test case 4");
	}
	@Test
	public void test5()
	{
		System.out.println(" test case 5");
	}
	
	

}
