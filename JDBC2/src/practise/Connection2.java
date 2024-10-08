package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Connection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter id:");
		
		int id=scan.nextInt();
		System.out.println("Please enter name :");
		String name=scan.next();
		
	try {
			
			
			
			
			
			//1)Create a connection. (Connection)
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/intutech","root","root");
          
			//dynamic query.
			//static query
			PreparedStatement stmt=con.prepareStatement("insert into demo values(?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			
			//PreparedStatement stmt=con.prepareStatement("insert into demo values(45,'rohit')");
			int i=stmt.executeUpdate();
			
			System.out.println("number of rows affected :"+i);
			
						
			//System.out.println("Connection Opened !");	
			con.close();
			
			
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
