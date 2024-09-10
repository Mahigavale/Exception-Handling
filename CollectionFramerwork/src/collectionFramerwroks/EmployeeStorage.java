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
		
		
		Iterator<Employee> itr=Intutech.iterator();
		
		
		while(itr.hasNext())
		{
			Employee emp2=itr.next();
			if(emp2.name=="Dupari")
			{
				System.out.println(emp2.mobile);
			}
			else
			{
				continue;
			}
		}
		
		//boolean flag=true;
//		for(Employee emp:Intutech)
//		{
//			if(emp.mobile=="777483434412")
//			{
//				System.out.println(emp.name);
//				flag=false;
//			}
//			
//			else
//			{
//				continue;
//			}
//			
//		}
//		
//		if(flag==true)
//		{
//			System.out.println("no such number");
//		}
//		else
//		{
//			System.out.println("number printed above.");
//		}
//		
//		
	}

}
