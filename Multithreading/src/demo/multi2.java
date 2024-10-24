package demo;

public class multi2  implements Runnable {
 
	//Runnable i/f=> to convert class into multithreadable class.
	
	@Override
	public void run() {
		
		
		for(int i=10;i<15;i++)
		{
			System.out.println(i + "from thread two");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i==12)
			{
				throw new RuntimeException();
			}
		}
		
	}

}
