package mySQLScript.Task12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLTask {

	public static void main(String[] args) throws SQLException {
	
		String URL="jdbc:mysql://localhost:3306/Employee";
		String uname="root";
		String pwd="Jeshvith@123";
		Connection con=DriverManager.getConnection(URL,uname,pwd);
		PreparedStatement s=con.prepareStatement("insert into Employee values (101,'Jenny',25,10000);");
		PreparedStatement s1=con.prepareStatement("insert into Employee values (102,'Jacky',30,20000);");
		PreparedStatement s2=con.prepareStatement("insert into Employee values (103,'Joe',20,40000);");
		PreparedStatement s3=con.prepareStatement("insert into Employee values (104,'John',40,80000);");
		PreparedStatement s4=con.prepareStatement("insert into Employee values (105,'Shameer',25,90000);");
        s.executeUpdate();
        s1.executeUpdate();
        s2.executeUpdate();
        s3.executeUpdate();
        s4.executeUpdate();
		s.close();
			
	}

}
