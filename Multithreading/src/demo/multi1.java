package demo;

public class multi1 extends Thread {
	
	//Thread class :=> multithreadable class
	//when you extend the thread class on a specific class it becomes multithreadable.
	
	
	@Override
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +" from thread one");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
