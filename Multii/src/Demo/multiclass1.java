package Demo;

public class multiclass1 extends Thread {
	
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





//there are the two ways by which we can create the multithreadable classes in the java
//one is extending Thread class.
//second is implementing the runnable interface.

//new
//active;running runnable
//waiting,blocked
//dead/terminated
//