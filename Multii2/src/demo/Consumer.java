package demo;

public class Consumer {

	public static void main(String[] args) {

		
		
		sharedresource rs=new sharedresource();
		
		Mul1 mul=new Mul1(rs);
		
		Mul2 mul2=new Mul2(rs);
		
		
		mul.start();
		
		mul2.start();
		

		
	}

}
