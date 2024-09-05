package exceptiondemo2;

public class Exceptiondemo {
	
	public static void main(String args[])
	{
		
		
		
		int i=5;
		int j=0;
		
		try {
		System.out.println(i/j); 
		//Critical Code
		}
		
	
		catch(Exception E)
		{
			System.out.println(E.getMessage());
			//We catch the Exception here !
			
		}
		finally {
			System.out.println("The Code executed !");
			//Fix Output !
		}
		
	}
}
