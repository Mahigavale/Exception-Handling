package Demo;

import java.util.ArrayList;
import java.util.List;

public class Constructorreference {

	public static void main(String[] args) {
		

		
		List<String> names=new ArrayList<String>();
		names.add("Mahesh");
		names.add("Ashok");
		names.add("Pooja");
		
		
		names.forEach(Demo::new);
	}

}

  class Demo
{
	
	
	
	public Demo(String s)
	{
		System.out.println(s);
	}
}