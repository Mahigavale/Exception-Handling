package customDemo;

public class ShubhamExceptionConsumer {

	public static void main(String[] args) {

		
		
		int i=6;
		int j=5;
		
		
		try
		{
			if(i+j >10)
			{
				throw new ShubhamException("5");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
