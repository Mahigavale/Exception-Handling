package anudip_foundation;

public class failedtry {

	
	public static void main(String args[])
	{
		
		
		
		
		
		
		int [] arr=new int[3];
		        arr[0]=10;
				arr[1]=20;
				arr[2]=30;
				
				
				int largest=0;
				int second=0;
				
				for(int i=0;i<arr.length;i++)
				{
					if(largest<arr[i])
					{
						second=largest;
						largest=arr[i];
					}
				}
                
                 System.out.println(second);
		
}
}

