package collectionFramerwroks;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee> Hcl=new ArrayList();
		
		
		Employee e=new Employee(23,"matthew","12345678");
		
	  Hcl.add(e);
	  Hcl.add(new Employee(24,"john","7777777"));
	  Hcl.add(new Employee(25,"kartik","90909090"));
	  
	  
	  Iterator<Employee> itr=Hcl.iterator();
	  //hasnext, next, remove ,set
	  
	  while(itr.hasNext())
	  {
		  Employee emp2=itr.next();
		  //object mapping
		 // System.out.println(emp2.name);
		 // System.out.println("**************************");
		  
		  if(emp2.name=="matthew")
		  {
			  itr.remove();
		  }
		  else
		  {
			  System.out.println(emp2.name);
		  }
	  }
	  
	  

	}

}
