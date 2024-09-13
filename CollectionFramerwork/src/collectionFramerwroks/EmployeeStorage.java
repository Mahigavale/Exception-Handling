package collectionFramerwroks;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<Employee> Intutech=new ArrayList();
		
		System.out.println(Intutech.size());
		System.out.println(Intutech.size());
		
		//ArrayList<T> name=Arraylist instance.
		
		
		Employee One=new Employee(12,"mahesh","7774834341");
		
		Intutech.add(One);
		System.out.println(Intutech.size());
		Intutech.add(new Employee(13,"mahe","7774834345"));
		Intutech.add(new Employee(13,"pahe","7774834342"));
		Intutech.add(new Employee(13,"Ishwari","7774834343"));

		Intutech.add(new Employee(13,"Dupari","7774834344"));


		System.out.println(Intutech);
		
		//name=>"Ishwari";
		
		for(Employee emp:Intutech)
		{
			if(emp.name=="Ishwari")
			{
				System.out.println(emp.mobile);
				
			}
			else
			{
				continue;
			}
	}
		
	
		
		

	}

}
