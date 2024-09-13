package collectionFramerwroks;

import java.util.HashSet;
import java.util.Set;

public class Setdemo {

	public static void main(String[] args) {

		
		
		
		Set<Integer> set=new HashSet<Integer>(); //Type safe
		//Hashing algorithm
		//dynamic,unique,non-index-based
		// 1)Intersection ,2) union, 3)difference.
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.add(5);
		set2.add(4);
		set2.add(3);
		set2.add(9);
		set2.add(10);
	
		
		//1)Union :=>Add all
		
		Set<Integer> union_set=new HashSet<Integer>(set);
		
		union_set.addAll(set2);
        
		System.out.println(set);
		System.out.println(set2);
		
		System.out.println("Union Set Examples:");
		
		System.out.println(union_set);
		
		//2)Difference :=>Remove all
		
		Set<Integer> difference_set=new HashSet<Integer>(set);
		
		difference_set.removeAll(set2);
		System.out.println("Difference Set examples:");
		System.out.println(difference_set);
		
		
		//3)Intersection :=>RetainAll
		
		Set<Integer> intersected_set=new HashSet<Integer>(set);
		
		intersected_set.retainAll(set2);
		System.out.println("Intersection set effect :");
		
		System.out.println(intersected_set);
	
	}

}
