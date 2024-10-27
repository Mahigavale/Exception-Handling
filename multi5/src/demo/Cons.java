package demo;

public class Cons {
	
	public static void main(String args[])
	{
		
		t2 T2=new t2();
		
		t1 T1=new t1();
		
		Thread t=new Thread(T1);
		
		
		T2.setPriority(10);
		t.setPriority(7);
		
		//Priority => convention , not in our hands.
		
		t.start();
		T2.start();
		
		
		System.out.println("default :"+t.getPriority());
		System.out.println("default:"+T2.getPriority());
		//standard
		
		//1=>lowest 
		//10=>highest
		
		
	}

}
