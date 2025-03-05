package TestNG;

import org.testng.annotations.Test;

public class depend {
	@Test(dependsOnMethods= {"test2"})
	public void test1() {
		System.out.println("test case 1");
	}
	@Test(dependsOnMethods= {"test3"})
	public void test2() {
		System.out.println("test case 2");
	}
	@Test
	public void test3() {
		System.out.println("test case 3");
	}
	@Test
	public void test4() {
		System.out.println("test case 4");
	}

}
