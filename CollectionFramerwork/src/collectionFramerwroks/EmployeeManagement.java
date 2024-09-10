package collectionFramerwroks;

import java.util.ArrayList;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee> Hcl=new ArrayList();
		
		
		Employee e=new Employee(23,"matthew","12345678");
		
	  Hcl.add(e);
	  Hcl.add(new Employee(24,"john","7777777"));
	  Hcl.add(new Employee(25,"kartik","90909090"));
	  
	  
	  
	  for(Employee Emp:Hcl) //Object mapping 
	  {
		  
		  System.out.println(Emp.id);
		  System.out.println(Emp.name);
		  System.out.println(Emp.mobile);
		  System.out.println("*************************************");
	  }
	  
	}

}
