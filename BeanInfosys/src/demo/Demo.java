package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String args[])
	{
		
		
	
		
		List<Integer> numbers=new ArrayList<Integer>();
		
		
		numbers.add(23);
		numbers.add(78);
		numbers.add(67);
		numbers.add(66);
		numbers.add(56);
		numbers.add(12);
		
		
		
		List<Integer> num2=numbers.stream().
				filter(n-> n%2==0).
				map(n->n*2).collect(Collectors.toList());
		
		System.out.println(num2);
		
		
		
		int result=numbers.stream()
				.filter(n->n%2==1)
				.map(n->n*2)
				.reduce(0, (c,e)->c+e);
		
		System.out.println(result);
	}
}
