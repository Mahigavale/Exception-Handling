package collectionFramerwroks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Vector<Integer> v=new Vector();
//		
//		v.add(12);
//		v.add(23);
//		v.add(34);
//		v.add(34);
//		v.add(55);
//		//12,23,34,34,55
//		
//		Iterator<Integer> itr=v.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		
		
		
		LinkedList<Integer> list2=new LinkedList();
		
		list2.add(123);
		list2.add(34);
		
		for(int j:list2)
		{
			System.out.println(j);
		}
	}

}
