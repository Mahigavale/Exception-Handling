package demo;

public class t1 implements Runnable {

	@Override
	public void run() {
	
		
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
			
			
			
			Thread.yield();
			//Optional
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
