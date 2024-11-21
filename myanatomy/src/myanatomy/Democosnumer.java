package myanatomy;

import java.util.Scanner;

public class Democosnumer {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		System.out.println(cal.add(12.0f, 12.0f));
		System.out.println(cal.add(12, 12));
		
		
		
		Scanner scan=new Scanner(System.in);
		
//		
//		System.out.println("enter the values :");
//		int n=scan.nextInt();
//		//here the newline character is remained in this line 
//		//so with the help of the scan.nextline();
//		//we consume that newline character here.
//		scan.nextLine();
//		
//		System.out.println("enter the string:");
//
//		String s=scan.nextLine();
//		
//		
//		System.out.println(n);
//
//	
//		System.out.println(s);
		
		
		System.out.println("please enter the string:");
		
		int i=scan.nextInt();
		 scan.nextLine();
		 //new line character is stayed in that specific line so
		 //to overcome it we use the nextLine() to consume it.
		String str=scan.nextLine();
		
		
		
		System.out.println(str+" "+i);
	}
	
	

}



class Calculator
{
	
	
public int add(int i, int j)
{
	return i+j;
}
	
	
	public float add(float i,float j)
	{
		return i+j;
	}
	
}