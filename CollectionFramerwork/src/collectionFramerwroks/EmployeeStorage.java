package collectionFramerwroks;

import java.util.ArrayList;

public class EmployeeStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<Employee> Intutech=new ArrayList();
		
		//ArrayList<T> name=Arraylist instance.
		
		
		Employee One=new Employee(12,"mahesh","7774834341");
		
		Intutech.add(One);
		Intutech.add(new Employee(13,"mahe","7774834345"));
		Intutech.add(new Employee(13,"pahe","7774834342"));
		Intutech.add(new Employee(13,"Ishwari","7774834343"));

		Intutech.add(new Employee(13,"Dupari","7774834344"));


		System.out.println(Intutech);
		
		boolean flag=true;
		for(Employee emp:Intutech)
		{
			if(emp.mobile=="777483434412")
			{
				System.out.println(emp.name);
				flag=false;
			}
			
			else
			{
				continue;
			}
			
		}
		
		if(flag==true)
		{
			System.out.println("no such number");
		}
		else
		{
			System.out.println("number printed above.");
		}
		
		
	}

}
