package dbConnectionExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MYSQLExample {
	
	
	
	@Test
	public void verifyDBTest() throws Exception {
		
		
//		jdbc:mysql://localhost:3306/sakila
//			com.mysql.jdbc.Driver
//			user/pass: root/root
		
		String dbURL = "jdbc:mysql://localhost:3306/myflixdb";
		String username = "root";
		String pass = "root";
		
		//String query = "SELECT * FROM actor;";
		
		String query = "SELECT * FROM movies;";
		
		
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dbURL, username, pass);
		
		
		Statement statement = con.createStatement();
		
		
		ResultSet rs = statement.executeQuery(query);
		
		
		
		while(rs.next()) {
			
			String demoactorID = rs.getString(1);
			String name = rs.getString(2);
			System.out.println("User Details: " + demoactorID + " : " + name);
			
			System.out.println("------------------------------------");
		}
		
		
		con.close();
		
	}

}
