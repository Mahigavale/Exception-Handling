package demo;

public class Student_address implements Cloneable {

	
	int aid;
	
	public Student_address(int aid)
	{
		this.aid=aid;
	}
	
	
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
