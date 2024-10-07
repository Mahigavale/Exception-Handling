package Practise;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			
			
			
			//1) Registering a driver.
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2)Create a connection. (Connection)
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/intutech","root","root");
			
			
			
			System.out.println("Connection Opened !");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
   catch(Exception e)
		{
	   e.printStackTrace();
		}
		finally
		{
			System.out.println("code executed !");
		}
	}

}
