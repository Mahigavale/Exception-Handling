package exceptiondemo;

public class AnimalConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tiger t=new Tiger("Hiiiii");
		
		int []numbers= {1,2,3,4,5};
		//0,1,2,3,4,5
		
		System.out.println(numbers[5]);
		//Runtime Exception -> Unchecked Exception.
		//CompileTime => no error !

	}

}
class Tiger extends Animal{
	
	
	
	
	public Tiger(String abc)
	{
		super(abc);
	}
	
	public void Showt()
	{
		
		super.i=45;
		super.Show();
	}
	
}
