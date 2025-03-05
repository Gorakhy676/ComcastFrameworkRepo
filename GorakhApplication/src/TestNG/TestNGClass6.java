package TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNGClass6 {
	@AfterTest
	public void aftsuite(){
		System.out.println(" afterclass is exicute");
	}
	@BeforeSuite
	public void befsuite() {
		System.out.println("before suite method exicute");
	}
	@BeforeTest
	public void beftest(){
		System.out.println("before test class is exicute");
	}
	@AfterSuite
	public void afttest(){
		System.out.println(" after test class is exicute");
	}
	@BeforeMethod
	public void befmethod(){
		System.out.println(" before methodclass is exicute");
	}
	@AfterMethod
	public void aftmethod(){
		System.out.println("after method class is exicute");
	}
	@Test
	public void test1() {
		System.out.println("test case is exicute");
	}

}
