package demo;

public class Consumer {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Student_address add=new Student_address(15);
		Student one=new Student(12,"mahesh",add);
		
		
		//Student two=one;
		
		Student two=(Student)one.clone();

		
		two.name="Aashay";
		two.address.aid=27;
		
		System.out.println(one.name);
		System.out.println(two.name);
		
		System.out.println(two.address.aid);
		System.out.println(one.address.aid);
	}

}
