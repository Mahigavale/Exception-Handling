package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(12);
		numbers.add(23);
		numbers.add(34);
		numbers.add(45);
		
		
		
		ListIterator<Integer> itr=numbers.listIterator();
		
		
		while(itr.hasNext())
			
		{
			itr.next();
		}
		//forward and then backward.
		
		System.out.println("*****************************************");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}