package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/intutech","root","root");
	
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from demo;");
			while(rs.next())
			{
				System.out.println("Id:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("********************************");
			}
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
