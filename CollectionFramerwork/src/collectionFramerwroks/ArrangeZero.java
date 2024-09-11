package collectionFramerwroks;

import java.util.ArrayList;

public class ArrangeZero {

	public static void main(String[] args) {

		
		int[] numbers1= {33,1,0,67,2,0};
		
		ArrayList<Integer> numbers=new ArrayList();
		//{1,2,4,6,0,0}
	//	numbers.addAll(numbers);
		
	
	int count=0;
		for(int i=0;i<numbers1.length;i++)
		{
			if(numbers1[i]==0)
			{
				count++;
				continue;
			}
			else
			{
				numbers.add(numbers1[i]);
			}
		}
		
		
		int demo=numbers.size();
		int demo2=numbers.size()+count;
		
		System.out.println("original array :");
		for(int j:numbers1)
		{
			System.out.print(j+" ");
		}
		
		for(int i=demo;i<demo2;i++)
		{
			numbers.add(i, 0);
		}
		System.out.println();
		System.out.println("desired output :");
		for(int j:numbers) {
			System.out.print(j+" ");
		
	}

}}
