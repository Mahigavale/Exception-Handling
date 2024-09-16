package LogicBuilding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Array1 {

	public static void main(String[] args) {

		
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		
		mp.put(1, 23);
		mp.put(2, 46);
		mp.put(3, 69);
		mp.put(4, 92);
		mp.put(5, 87);
		mp.put(6, 115);
		
		System.out.println(mp);
	
		
		for(Map.Entry<Integer,Integer> e:mp.entrySet())
		{
			System.out.println("Key:"+e.getKey());
			System.out.println("Value:"+e.getValue());
		}
	
	}}
