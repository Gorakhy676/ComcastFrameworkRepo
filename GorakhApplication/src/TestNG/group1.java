package TestNG;

import org.testng.annotations.Test;

public class group1 {
	@Test
	public void group5() {
		System.out.println("group 5 is pass");
	}
	@Test
	public void group6() {
		System.out.println("group 6 is pass");
	}
	@Test(groups="Smoke")
	public void group7() {
		System.out.println("group 7 is pass");
	}
	@Test
	public void group8() {
		System.out.println("group 8 is pass");
	}

}
