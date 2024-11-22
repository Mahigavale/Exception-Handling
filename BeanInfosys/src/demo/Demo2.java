package demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {

		
		
		Set<String> names=new HashSet<String>();
		
		names.add( "Mahesh");
		names.add( "Ashwin");
		names.add( "Pooja");
		names.add( "Ashok");
		
		Consumer<Set<String>> c=message->
		{
			for(String n:message)
			{
				System.out.println(n);
			}
		};
		
		c.accept(names);
		
		
		
		
		
		
		
		
		
		//.stream().sorted().forEach(s-> System.out.println(s));
		
		//System.out.println(sorted);
		
		
	}

}
