package Demo;

import java.util.ArrayList;
import java.util.List;

public class Methodreference2 {
	
	
	
	

	public static void main(String[] args) {
		
		
		List<String> names=new ArrayList<String>();
		
		names.add("mahesh");
		names.add("ashok");
		names.add("mansi");
		names.add("pratik");
		
		demo1 d =new demo1();
		
		names.forEach(d::print);
		
		
		System.out.println("********************************8");
		
		d.print_re(names);
		//we can directly access it because it is in the same class
		//and the given method is static so we don't need to 
		//create the object of the same here.
		//if the method was non-static and in some different class
		//we must create a object of the given class to
		//access the given method.
		
	}

}
class demo1
{
	public void print(String s)
	{
	
		System.out.println(s);
	}
	
	
	public void print_re(List<String> names)
	{
		names.forEach(this::print);
	}
	
}
