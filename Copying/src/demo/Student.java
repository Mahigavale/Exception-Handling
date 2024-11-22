package demo;

public class Student implements Cloneable {

	
	int id;
	String name;
	Student_address address;
	
	public Student(int id, String name,Student_address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	
	protected Object clone() throws CloneNotSupportedException
	{
		Student st=(Student)super.clone();
		st.address=(Student_address) address.clone();
		
		return st;
	}
}
