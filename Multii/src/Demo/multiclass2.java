package Demo;

import java.util.ArrayList;
import java.util.List;

public class multiclass2 extends Thread {

	Counter c=new Counter();
	@Override
	public void run()
	{	
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.increment();
			
			
			
		System.out.println("Get:"+ c.getcount());
			
			}

}
