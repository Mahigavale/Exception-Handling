package miscellenious.demo;

public class AnnonymousDemo {

	public static void main(String[] args) {
		
		Animal an=new Animal()
				{
			public void run()
			{
				System.out.println("add from anonymous !");
			}
				};
				
				
				
				Animal an2=new Animal();
				
				
			an2.run();	
				
				
				
				an.run();

	}

}


class Animal{
	
	
	public void run()
	{
		System.out.println("animal is running !");
	}
}