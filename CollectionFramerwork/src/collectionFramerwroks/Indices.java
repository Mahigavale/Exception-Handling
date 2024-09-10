package collectionFramerwroks;

import java.util.ArrayList;

public class Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList(25);
		//10 default size. //25
		
	
		  list.add("name");
		  list.add(23);
		  list.add(123.45);
		  
		  
		  ArrayList list2=new ArrayList();
		  
		  list2.add(12);
		  list2.add("fighter");
		  list2.add(34.56);
		  
		  
		  System.out.println(list);
		  
		 
		  System.out.println(list.addAll(list2));
		  
		  
		  System.out.println(list);
		  System.out.println(list.remove(2));//removed element
		  System.out.println(list);
		  
		  
		  System.out.println(list.get(4));
		  
		  System.out.println("Contains:"+list.contains("fighter"));
		  
//		  
//		  for(int i=0;i<list.size();i++)
//		  {
//			  System.out.println(list.get(i));
//		  }
//		  
//		  System.out.println(list);
		
		
//		ArrayList numbers=new ArrayList();
//		
//		numbers.add(12);
//		numbers.add(24);
//		numbers.add(36);
//		
//		for(int i=0;i<numbers.size();i++)
//		{
//			System.out.println(numbers.get(i));
//		}
//	}
	
	}
}
