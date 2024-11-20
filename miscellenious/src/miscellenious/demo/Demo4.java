package miscellenious.demo;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException  {
		
		
		Counter c=new Counter();
		
		Thread t1=new Thread(new Runnable(){
			public void run()
			{
				for (int i=0;i<1000;i++)
				{
					c.increament();
				}
			}
		
		;
	

});
		
		
		
		Thread t2= new Thread(new Runnable() {
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					c.increament();
				}
			}
			
		});
	
		
		
		
		
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		//t1.join();
		
		System.out.println("count :"+c.count);
	}
}

class Counter
{
	
	int count;
	
	
	public synchronized void increament()
	{
		count ++;
	}
}