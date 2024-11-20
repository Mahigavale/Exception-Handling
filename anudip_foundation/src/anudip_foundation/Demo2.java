package anudip_foundation;

import java.util.Scanner;

public class Demo2 {
	
	public static void main(String args[])
	{
		
		// int=> [0,1,2,3,4]
		
		
		System.out.println("please enter the size of the array !");
		
		Scanner scan=new Scanner(System.in);
		
		   int i=scan.nextInt();
		   
		   int[] arr=new int[i];
		   // 0 -1
		   
		   System.out.println("you have to enter :"+ (arr.length)+"elements.");
		   
		   //int k=0;
		   
		   for(int j=0;j<arr.length;j++)
		   {
			   
			   
			   System.out.println("please enter :"+ (j+1) +"element");
			   
			 
			   arr[j]=scan.nextInt();
		   }
		   
		    System.out.println("given array :"+ arr);
		
		
		    
		    
		
		    
		    for(int j=0;j<arr.length;j++)
		    {
		    	for(int k=j;k<arr.length;k++)
		    	{
		    		
		    		if(arr[i]>arr[k])
		    		{
		    			arr[i]=arr[k];
		    		}
		    	}
		    }
		    
		    System.out.println(arr[arr.length-1]);
			
			//System.out.println(num);
			
			//System.out.println(arr2[1]);
	}
	


}
