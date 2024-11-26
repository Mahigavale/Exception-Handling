package object_methods;

public class Equalsmethod {

	int id;
	String name;

	@Override
	public String toString() {
		return "id: " + id + "name :" + name;
	}

	@Override
	public boolean equals(Object O) {
		Equalsmethod e = (Equalsmethod) O;

		if (id == e.id && name == e.name) {
			return true;
		}

		else {
			return false;
		}
	}
		@Override
		public int hashCode()
		{
			return 23+id+name.hashCode();
			
			
			//convert the string field to the respective hash value and then
			//return it so that the 
			//the contract between the hashCode and equals remain the same.
		}

	

	public static void main(String[] args) {

		Equalsmethod E = new Equalsmethod();

		E.id = 23;
		E.name = "mahesh";

		Equalsmethod E1 = new Equalsmethod();

		E1.id = 23;
		E1.name = "mahesh";

		System.out.println(E.equals(E1));
		System.out.println(E.hashCode());
		System.out.println(E1.hashCode());

	}

}
