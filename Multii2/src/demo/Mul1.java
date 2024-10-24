package demo;

import java.util.List;

public class Mul1 extends Thread {
	
	
	 public sharedresource resource;
	 
	 public Mul1(sharedresource resource)
	 {
		 this.resource=resource;
	 }
	
	@Override
	public void  run()
	{
		synchronized(resource) {
		
		resource.setnames(1,"akshay");
		List<String> name2=resource.getnames();
		
		
		
		for(String name:name2)
		{
			System.out.println(name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		resource.notify();
		}
	}

}
