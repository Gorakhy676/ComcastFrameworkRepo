package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test2 {
	@Test(dataProvider="getData")
	public void  createContactTest(String firstName,String lastName,long phoneNumber)
	{
		System.out.println("FirstName :"+firstName +", LastName :"+lastName+"    phoneNumber   "+phoneNumber);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="Ram";
		objArr[0][1]="Singh";
		objArr[0][2]=9919049480l;
		objArr[1][0]="Ayush";
		objArr[1][1]="Yadav";
		objArr[1][2]=6388109903l;
		objArr[2][0]="Anshuman";
		objArr[2][1]="Yadav";
		objArr[2][2]=9696099103l;
		return objArr;
		
	}
}
