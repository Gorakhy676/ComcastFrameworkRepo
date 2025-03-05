package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {
	
	@Parameters({"URL","username","password"})
	@Test
	public void test1(String urlname,String usname,String pwd) {
		System.out.println("1st test case");
		System.out.println(urlname);
		System.out.println(usname);
		System.out.println(pwd);
		
	}
	@Test
	public void test2() {
		System.out.println("2st test case");
	}
	@Test
	public void test3() {
		System.out.println("3st test case");
	}
}
