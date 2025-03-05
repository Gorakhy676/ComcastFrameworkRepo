package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testExicute {
	@BeforeTest
	public void exicuteTest1() {
		System.out.println("before test case exicute");
		}
	@BeforeSuite
	public void exicuteTest2() {
		System.out.println("before suite test case exicute");
		}
	@Test
	public void exicuteTest3() {
		System.out.println("test case exicute");
		}
	@AfterTest
	public void exicuteTest4() {
		System.out.println("after  test case exicute");
		}
	@AfterSuite
	public void exicuteTest5() {
			System.out.println("after suite test case exicute");
			}

}
