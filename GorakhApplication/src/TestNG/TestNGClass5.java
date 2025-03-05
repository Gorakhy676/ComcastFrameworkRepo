package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass5 {
	@BeforeTest
	public void pLone1() {
		System.out.println("it is first personam lone");
	}
	@AfterTest
	public void pLone2() {
		System.out.println("it is second personam lone");
	}
	@Test
	public void pLone3() {
		System.out.println("it is third personam lone");
	}
	@Test
	public void pLone4() {
		System.out.println("it is fourth personam lone");
	}

}
