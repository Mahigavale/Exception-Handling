package object_methods;

public class Hashcodemethod {
	

	//instance variable
	int id;
	String name;
	
	


	@Override
	public String toString() {
		return "Hashcodemethod : id" + id + ", name=" + name;
	}



	@Override 
	public int hashCode()
	{
		
		return id;
	}
	


	public static void main(String[] args) {
		
		
		Hashcodemethod method=new Hashcodemethod();
		Hashcodemethod method_one=new Hashcodemethod();
		
		method.id=34;
		method.name="mahesh";
		
		method_one.id=56;
		method_one.name="Ashwin";
		
		
		System.out.println(method);
		
		System.out.println(method.hashCode());
		
		System.out.println(method_one.hashCode());
	}

}


//hashCode method is important for working with the data structures which are dependant
//on the hash value of the given object.
//hashMap,hashtable,hashset => works with the hash.
