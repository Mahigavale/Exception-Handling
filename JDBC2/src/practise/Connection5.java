package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//statement : add, static ,parameterized false
		
		
		try
		{
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/intutech","root","root");
			
			
			Statement stmt=con.createStatement();
			
			int i=stmt.executeUpdate("insert into demo values (18,'virat')");
			//select 
			//preparestatement
			
			System.out.println("number of rows affected :"+i);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
