package collectionFramerwroks;

import java.util.Iterator;
import java.util.Vector;

public class VectorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Employee> vec=new Vector();
		
		vec.add(new Employee(23,"sdf","34567"));
		
		//System.out.println(vec.capacity());
		
		
		Iterator<Employee> vct=vec.iterator();
		
		while(vct.hasNext())
		{
			Employee emp2=vct.next();
			System.out.println(emp2.id);
		}

	}

}
