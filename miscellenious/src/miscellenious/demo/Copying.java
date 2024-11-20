package miscellenious.demo;

public class Copying {

	public static void main(String args[]) throws CloneNotSupportedException
	{
		
		
		//Shallow copy.
		
		//here we are creating the single object of the given class
		//and referring it to the two variables.
		//so changing the value from the one object will change the values from both
		//the objects.
		//this is the reference copy concept.
		//with the help of the cloneable interface we can copy the object with the help of
		//clone method.
		
		Student st=new Student(12,"mahesh");
		
		Student st2=(Student)st.clone();
		
		st2.id=15;
		
		
		System.out.println(st.id);
        System.err.println(st2.id);		
		
	}
}


class Student implements Cloneable
{
	
	
	int id;
	String name;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}