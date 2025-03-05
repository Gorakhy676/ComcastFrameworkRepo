package TestNG;

import org.testng.annotations.Test;

public class group {
	@Test
	public void group() {
		System.out.println("group 1 is pass");
	}
	@Test
	public void group2() {
		System.out.println("group 2 is pass");
	}
	@Test(groups="Smoke")
	public void group3() {
		System.out.println("group 3 is pass");
	}
	@Test
	public void group4() {
		System.out.println("group 4 is pass");
	}

}
