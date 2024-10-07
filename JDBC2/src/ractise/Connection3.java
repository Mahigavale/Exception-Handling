package ractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Connection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // update the table based on id.
		//connection create,sql query write, sql query execute.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter the id:");
		int id=scan.nextInt();
		System.out.println("please enter the name :");
		String name=scan.next();
		try {
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/intutech","root","root");
		
		
	//static query.
	//dynamic query.
	PreparedStatement stmt=con.prepareStatement("update demo set name=? where id=?");
	
	stmt.setString(1,name);
	stmt.setInt(2, id);
	
	
	int i=stmt.executeUpdate();
	
	System.out.println("number of rows affected :"+i);
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
