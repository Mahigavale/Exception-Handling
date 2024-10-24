package Demo;



public class Consumer {

	public static void main(String[] args) {
	
		
		multiclass1 c1=new multiclass1();
		
		multiclass2 c2=new multiclass2();
		
		multiclass3 c3=new multiclass3();
		
		Thread t1=new Thread(c3);
		
		t1.start();
		c1.start();
		c2.start();
		
		
		

	}

}
