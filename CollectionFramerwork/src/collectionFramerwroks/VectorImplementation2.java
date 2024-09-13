package collectionFramerwroks;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorImplementation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector vc=new Vector(); //generic
		
		 vc.add(123);
		 vc.add('C');
		 vc.add("String");
		 
		 System.out.println(vc);
		 
		 
		 Vector<String> vc1=new Vector();
		 vc1.add("1");
		 vc1.add("mnv");
		 
		 System.out.println(vc1);
		 //generic and type safe in java collection.
		
		 vc1.addElement("only");
		 
		 System.out.println(vc1);
		 //synchronized and legacy methods in java.
		 

	}

}
