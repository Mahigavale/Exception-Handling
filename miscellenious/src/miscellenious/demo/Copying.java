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
		
		
		
		//so basically we are able to copy the primitive data types but with the custom and
		//non primitive we are getting the problem of the deep vs shallow copy.
		Address add=new Address(17);
		Student st=new Student(12,"mahesh",add);
		
		Student st2=(Student)st.clone();
		
		st2.id=15;
		
		st2.address.addid=56;
		
		
		System.err.println("****************");
		System.out.println(st.id);
        System.err.println(st2.id);		
        System.out.println("**********");
        
        System.out.println(st.address.addid);
        System.out.println(st.address.addid);
		
	}
}


class Student implements Cloneable
{
	
	
	int id;
	String name;
	Address address;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
	public Student(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
}


class Address{
	int addid;
	
	
	
	public Address(int addid)
	{
		this.addid=addid;
	}
}