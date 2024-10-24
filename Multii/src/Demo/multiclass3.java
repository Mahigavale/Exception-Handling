package Demo;

public class multiclass3 implements Runnable {

	
	Counter c=new Counter();
	@Override
	public void run()
	{	
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.increment();
			
			
			
		System.out.println("Get:"+ c.getcount());
			
			}
		
	}


