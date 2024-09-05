package exceptiondemo2;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		
		Vit v=new Vit();
		 v.Add(23, 0);

	}

}

class Vit{
	
	public void Add(int i,int j)
	{
		
		try {
			if(i==0 || j==0)
			{
				throw new Exception("zero deu nako re baba !");
			}
			else
			{
				System.out.println(i+j);
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("code executed !");
		}
	}
	
	
}