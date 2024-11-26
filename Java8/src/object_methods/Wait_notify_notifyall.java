package object_methods;

public class Wait_notify_notifyall {

	public static void main(String[] args) throws InterruptedException {

		
	Test t=new Test();
	
	synchronized(t)
	{
		t.start();
		
		t.wait(1000);
		
		System.out.println("main started !");
	}
	
	System.out.println("main printed something !");
	}
	
}

class Test extends Thread {

	
	public void run() {
		
		synchronized(this) {
			
			System.out.println("test Thread Starting !");
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("output is :" + i);
		}
		System.out.println("notifying remaining threads !");
		notifyAll();
	}
	}
}

