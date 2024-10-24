package demo;

import java.util.List;

public class Thread1 extends Thread {
	
	
	public Resourcelist resource;
	
	public Thread1( Resourcelist resource)
	{
		this.resource=resource;
	}
	
	

	
	@Override
	public void run()
	{
		
		resource.setname(1, "sehwag");
		
		List<String> nm2=resource.getnames();
		
		for(String n:nm2)
		{
			System.out.println(n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	
}

