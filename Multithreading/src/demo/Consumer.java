package demo;

public class Consumer {

	public static void main(String[] args)  throws Exception {
	

		
		
		
		multi1 m1=new multi1();
		
		multi2 m2=new multi2(); //not a thread.
		
		Thread t1=new Thread(m2);
		
		m1.start();//runnbale/running
		m1.join();  //allows a thread to complete it's execution.
		t1.start();//waited
		
	
	
	}

}
