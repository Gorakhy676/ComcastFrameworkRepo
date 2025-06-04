package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class SampleUnitTestChectProjectInBackEnd {
	@Test
	public void projectCheckTest() throws SQLException {
		
		String expectedProjectName ="CRM_011";
		boolean flag=false;
		
		//step 1: load/register the database driver
				Driver driverRef=new Driver();
				DriverManager.registerDriver(driverRef);
				
				//step 2: connect the database
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Root");
				System.out.println("===========");
				
				// step 3: create sql statement
				Statement stat=conn.createStatement();
				
				//step 4: execute select query & get result
				ResultSet resultset=stat.executeQuery("select * from projects");
				while (resultset.next())
				{
					
					String actProjectName=resultset.getString(2);
				//	System.out.println(actProjectName);
					if(expectedProjectName.equals(actProjectName))
					{
						flag=true;
						System.out.println(expectedProjectName+" is available===pass");
					}
					
				}
				if(flag==false) {
					System.out.println(expectedProjectName+"is not available==fail");
					Assert.fail();
				}
				
				//step 5 : close the connection
				conn.close();
	}

}
