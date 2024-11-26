package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Methodreference {

	public static void main(String[] args) {
		
		
		List<String> names=new ArrayList<String>();
		
		
		names.add("Mahesh");
		names.add("Saurabh");
		names.add("Sangita");
		names.add("Mansi");
		names.add("Kshitija");
		names.add("Payal");
		
		
		Consumer<String> c=new Consumer<String>()
				{
			
		   
			public void accept(String s)
			{
				System.out.println(s);
			}
				};
				
				
			
				names.forEach(c);
	
	

}


class Demmo
{
	
	
	public void printmessage(String s)
	{
		System.out.println("message:"+s);
	}
}
}