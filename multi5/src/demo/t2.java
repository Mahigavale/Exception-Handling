package demo;

public class t2  extends Thread{

	
	@Override
	public void run()
	{
		for(int i=10;i<15;i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
