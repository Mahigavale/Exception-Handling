package object_methods;

import java.util.HashSet;
import java.util.Set;

public class Hashcollisonexample {

	
	int id;
	String name;
	String email;
	
	
	public Hashcollisonexample(int id, String name,String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	
	
	
	public Hashcollisonexample()
	{
		
	}
	
	@Override 
	public int hashCode()
	{
		return 1;
	}
	
	
	@Override
	public String toString() {
		return "Hashcollisonexample : Id=" + id + ", name=" + name + ", email=" + email;
	}






	public static void main(String[] args) {
		
		
		HashSet<Hashcollisonexample> set=new HashSet<Hashcollisonexample>();
		
		Hashcollisonexample ex1=new Hashcollisonexample();
		
		ex1.email="demo@gmail.com";
		ex1.id=45;
		ex1.name="Mahesh";
		
		Hashcollisonexample ex2=new Hashcollisonexample();
		
		ex2.email="demo2@gmail.com";
		ex2.id=45;
		ex2.name="dada";
		
		
		set.add(ex2);
		set.add(ex1);
		
		
//		set.add(new Hashcollisonexample(23,"Mahesh","Nahi@gmail.com"));
//		set.add(new Hashcollisonexample(23,"Mahesh","Nahi@gmail.com"));
//		set.add(new Hashcollisonexample(23,"Mahesh","Nahi@gmail.com"));

		
		for(Hashcollisonexample h:set)
		{
			System.out.println(h.id);
             System.out.println(h.email);
             System.out.println(h.name);
		}

		
//		
//		Set<Integer> set2=new HashSet<Integer>();
//		
//		
//		set2.add(12);
//		set2.add(13);
//		set2.add(12);
//		
//		System.out.println(set2);
	}

}
