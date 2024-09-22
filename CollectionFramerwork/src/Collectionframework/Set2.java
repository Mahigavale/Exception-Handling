package Collectionframework;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> set1=new HashSet<Integer>();
		//16 default capacity ; 0.75 load factor
		
		set1.add(11);
		set1.add(11);
		set1.add(11); // hashing algorithm.
		set1.add(12);
		set1.add(13);
		
		//1)enhanced for loop.
		System.out.println("using enhanced for Loop :");
		for(int i:set1)
		{
			System.out.println(i);
		}
		
		Iterator<Integer> itr=set1.iterator();
		
		System.out.println("using Iterator :");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(set1);
	}

}

