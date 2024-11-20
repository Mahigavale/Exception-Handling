package demo;

public class C1 extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("C");
		
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
	}

}
