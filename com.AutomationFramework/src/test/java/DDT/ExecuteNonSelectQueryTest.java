package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteNonSelectQueryTest {

	public static void main(String[] args) throws Throwable {
		//step 1: load/register the database driver
				Driver driverRef=new Driver();
				DriverManager.registerDriver(driverRef);
				
				//step 2: connect the database
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Root");
				System.out.println("======Done=====");
				
				// step 3: create sql statement
				Statement stat=conn.createStatement();
				
				//step 4: execute select query & get result
				int result = stat.executeUpdate("insert into projects values('102','CRM_01','2025-02-20','2025-04-25','Completed')");
				System.out.println(result);
				
				
				//step 5 : close the connection
				conn.close();

	}

}
