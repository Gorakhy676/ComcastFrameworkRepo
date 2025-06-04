package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;
import com.mysql.jdbc.Driver;

public class ExecuteSelectQueryTest {

	public static void main(String[] args) throws Throwable {
		
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
			
			System.out.println(resultset.getString(1)+"\t"+ resultset.getString(2)+"  \t "+resultset.getString(3)+"\t"+ resultset.getString(4));
		}
		
		//step 5 : close the connection
		conn.close();
		
		
		
		

	}

}
