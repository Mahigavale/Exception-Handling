package demo;

import java.util.List;

public class Thread2 extends Thread {

	
	public Resourcelist resource;
	
	public Thread2(Resourcelist resource)
	{
		this.resource=resource;
		
	}
	
	
	@Override
	public void run()
	{
		synchronized(resource) {
		
		resource.setname(1, "hitman");
		
		List<String> nm2=resource.getnames();
		
		for(String n:nm2)
		{
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
		resource.notify();
		
	}
}
