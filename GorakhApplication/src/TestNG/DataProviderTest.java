package TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][2];
		data[0][0]="un11";
		data[0][1]="pwd1";

		data[1][0]="un2";

		data[1][1]="pwd2";

		data[2][0]="un3";

		data[2][1]="pwd3";
		return data;

	}
	@Test(dataProvider="getData")
	public void test1(String un1,String pwd1) {
		System.out.println("1st test case");
		System.out.println(un1);
		System.out.println(pwd1);
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
