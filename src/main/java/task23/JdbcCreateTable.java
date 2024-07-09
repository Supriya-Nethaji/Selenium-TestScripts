package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JdbcCreateTable {

	public static void main(String[] args) throws SQLException {
		
		//Database connection details
		
		String dbUrl="jdbc:mysql://localhost:3306";
		String user="root";
		String pass="root";
		
		//Establishing connection
		
		Connection conn = DriverManager.getConnection(dbUrl, user, pass);
		
		//Validating the connection
		
		if(conn !=null)
		{
			System.out.println("Coonection successful");
		} else
		{
			System.out.println("Issue with connection");
		}
		
		//Create statements and queries
		
		Statement stmt = conn.createStatement();
		
		String createDB = "create database Employee_JDBC"; //Create database
		
		String use = "use Employee_JDBC"; //use database
		
		String createTable = "create table emp_jdbc(empcode int, empname varchar(20), empage int, empsal int)"; // create table
		
		String insert = "insert into emp_jdbc values (101, 'JENNY' , 25, 10000)," //insert values to table
												+ "(102, 'JACKY', 30, 20000),"
												+ "(103, 'JOE', 20, 40000),"
												+ "(104, 'JOHN', 40, 80000),"
												+ "(105, 'SHAMEER', 25, 90000)";
	
		String select = "select * from emp_jdbc"; //retrieve the data
		
		//Execute the query
		
		stmt.execute(createDB);
		stmt.execute(use);
		stmt.execute(createTable);
		stmt.executeUpdate(insert);
		
		//Printing data from the table
		ResultSet res = stmt.executeQuery(select);
		while(res.next())
		{
			System.out.println(res.getInt("empcode") + " " + res.getString("empname") + " " + res.getInt("empage") + " " + res.getInt("empsal"));
		}
		
		//Close the connection
		conn.close();
		

	}

}
