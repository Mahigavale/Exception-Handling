package demo;

public class Consumer {

	public static void main(String[] args) {

		
		Resourcelist l=new Resourcelist();
		
		
		
		Thread1 t1=new Thread1(l);
		
		Thread2 t2=new Thread2(l);
		
		
		t2.start();
		t1.start();
		
		
		
	}

}
