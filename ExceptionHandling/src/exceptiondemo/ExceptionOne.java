package exceptiondemo;

import java.util.Scanner;

public class ExceptionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int j;
		
		Scanner scan=new Scanner(System.in);
		
		i=scan.nextInt();
		j=scan.nextInt();
		
		
		try
		{
			if(i !=0 && j !=0)
			{System.out.println(i/j);}
			
			else
			{
				throw new Zeroexception("ula la la ala ala a");
			}
		}
		
		catch(Zeroexception z)
		{
			System.out.println(z.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
		}
		
	
	Demo d=new Demo();
	
	
	try
	{
		d.dividere();
		
	}
	catch(Zeroexception e)
	{
		System.out.println(e.getLocalizedMessage());
	}
	finally
	{
		System.out.println("code exectued !");
	}

	}
}

class Demo
{
	
	public void dividere () throws Zeroexception
	{
		int num3=0;
		int num4=0;
		
		if(num3==0)
		{
			throw new Zeroexception("zero not allowed !");
		}
		System.out.println(num3/num4);
	}
}
	
