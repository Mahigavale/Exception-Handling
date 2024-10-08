package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GettingData {

	public static void main(String[] args) throws SQLException {

		
		
		
		//1)get all the users.
		//2) get user from specific id/name.
		
		
		
	
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/intutech","root","root");
			
			//Statement stmt=con.createStatement();
			Scanner scan=new Scanner(System.in);
			
			System.out.println("please enter the id you want to fetch:");
			int i=scan.nextInt();
			
			PreparedStatement stmt=con.prepareStatement("select * from demo where id=?");
			stmt.setInt(1, i);
			
			ResultSet rs=stmt.executeQuery();
			//table :rs
			
			
			while(rs.next()==true)
			{
				System.out.println("ID:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("************************");
			}
			
			
		
	}

}
