//package collectionframework;
//
//import java.util.HashMap;
//import java.util.Hashtable;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class Map1 {
//
//	public static void main(String[] args) {
//	
//
//		
//		Map<String,String> pincode=new HashMap<String,String>();
//		//System.out.println(pincode.size());
//		//System.out.println(pincode.size());
//		
//		pincode.put("111111", "Mumbai");
//		pincode.put("111111", "Pune");
//		pincode.put(null, null);
//		pincode.put(null, null);
//		pincode.put(null, "Pune");
//		pincode.put("222222", null);
//		pincode.put("333333", null);
//		//duplicate keys are not allowed.
//		
//		
//		for(Map.Entry<String,String> e :pincode.entrySet())
//
//		{
//			System.out.println("Key:"+e.getKey());
//			System.out.println("Value:"+e.getValue());
//		}
//		
//		System.out.println(pincode);
//
//		Map<String,String> pincode2=new Hashtable<String,String>();
//		//Synchronized and Thread safe.
//		//no null keys and values stored.
//		pincode2.put("45758", "Solapur");
//		System.out.println(pincode2);
//
//		
//		
//		Map<String,String> pincode3=new LinkedHashMap<String,String>();
//		
//		pincode3.put(null, null);
//		pincode3.put("123", null);
//		pincode3.put("1234", "rtwds");
//		System.out.println(pincode3);
//		System.out.println();
//		System.out.println();
//
//		System.out.println();
//		System.out.println();
//		System.out.println();
//
//		
//		Map<Integer,Employee> Intutech=new Hashtable<Integer,Employee>();
//		
//		Intutech.put(1, new Employee("John","Pune"));
//		Intutech.put(2,new Employee("paul","Solapur"));
//		System.out.println(Intutech);
//		
//		for(Map.Entry<Integer, Employee> e:Intutech.entrySet())
//		{
//			Employee e2=e.getValue();
//			System.out.println(e.getKey());
//			System.out.println(e2.getCity());
//			System.out.println(e2.getName());
//			
//			System.out.println("*************************************");
//			
//			
//		}
//	  
//		
//		
//		
//		
//	}
//
//}