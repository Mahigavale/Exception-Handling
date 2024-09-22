package collectionFramerwroks;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArranegZero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}


@FunctionalInterface
interface Demo{
	
	void demor();
	
	public default void show()
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		


	//numbers.forEach((n)->{System.out.println(n);});
		 numbers.forEach( (n) -> { System.out.println(n); } );
		 
		 Consumer<Integer> method=(n)->{System.out.println(n);};
	
}
}