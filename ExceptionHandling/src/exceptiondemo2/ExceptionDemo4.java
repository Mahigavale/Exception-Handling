package exceptiondemo2;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		
		Abc abc=  new Abc();
		
		abc.checkentry(6);
		

	}
}

class Abc
{
	
	public void checkentry(int i)
	{
      try
      {
    	  if(i>5)
    	  {
    		  throw new Exception("Invalid Entry !");
    	  }
    	  else
    	  {
    		  System.out.println("valid Entry :"+ i);
    	  }
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
      finally
      {
    	  System.out.println("Code Executed !");
      }
	}
	
	
}






//5>i , "Invalid Entry "