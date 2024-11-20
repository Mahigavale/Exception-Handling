package miscellenious.demo;

public class Copying3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Eddress ad1=new Eddress();
		
		ad1.id=45;
		
		
		Employee emp=new Employee(23,"mahehs",ad1);
		
		
		
		Employee emp2=(Employee)emp.clone();
		emp2.add.id=67;
		
		System.out.println(emp2.add.id);
		System.out.println(emp.add.id);

	}

}


class Employee implements Cloneable{
	int id;
	String name;
	
	Eddress add;
	
	
	protected Object clone() throws CloneNotSupportedException{
		Employee emp=(Employee) super.clone();
		emp.add=(Eddress)add.clone();
		return emp;
	}
	
	public Employee(int id,String name,Eddress add)
	{
		this.id=id;
		this.name=name;
		this.add=add;
	}
	
}

class Eddress implements Cloneable{
	int id;
	
	protected Object clone() throws CloneNotSupportedException{
		
		
		return super.clone();
	}
}