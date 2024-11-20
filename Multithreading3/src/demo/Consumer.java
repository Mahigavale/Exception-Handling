package demo;

public class Consumer {

	public static void main(String args[])
	{
		
		C1 c=new C1();
		C2 c1=new C2();
		
		c1.setPriority(8);
		c.setPriority(10);
		
		c1.start();
		c.start();
		
		
		
	}
}
