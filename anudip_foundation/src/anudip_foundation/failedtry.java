package anudip_foundation;

public class failedtry {

	
	public static void main(String args[])
	{
		
		
		
		int [] arr= {10,40,67,89,99};
		
		int  largest=0;
		int second=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				second=largest;
				largest=arr[i];
			}
		}
		
		
		System.out.println("the second largest number is :"+second);
}
}

