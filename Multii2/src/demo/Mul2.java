package demo;

import java.util.List;

public class Mul2 extends Thread {
	
	
 public sharedresource resource;
	 
	 public Mul2(sharedresource resource)
	 {
		 this.resource=resource;
	 }
	
	@Override
	public void run()
	{
		
		resource.setnames(1, "samiksha");
		
		List<String> name2=resource.getnames();
		
		//name2.set(1,"Samiksha");
		
		for(String name:name2)
		{
			System.out.println(name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
