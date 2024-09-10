package collectionFramerwroks;

import java.util.LinkedList;

public class LinkedlistImplementation {

	public static void main(String[] args) {

		
		
		LinkedList<Employee> emplist=new LinkedList();
		
		emplist.add(new Employee(12,"MAHESH","7774834341"));
		
		emplist.add(new Employee(23,"Pooja","45454545"));
		emplist.add(new Employee(23,"Pooja","45454545"));

		
		
		//System.out.println(emplist.remove(0));
		
		Employee emp3=emplist.remove(0);
		
		System.out.println(emp3.mobile);
		
		for(Employee emp:emplist)
		{
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
	}

}
