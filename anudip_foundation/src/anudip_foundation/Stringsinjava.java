package anudip_foundation;

public class Stringsinjava {

	public static void main(String[] args) {
		
		
		String str="Hello";
		
		StringBuffer strbf=new StringBuffer("Hello");
		
		StringBuilder strbld=new StringBuilder("Hello");
		
		
		//here a new string is created to which the reference has been lost
		//because we did not store it in the seperate variable.
		str.concat("Mahesh");
		
		strbf.append("Mahesh");
		strbld.append("Mahesh");
		
		System.out.println("Str:"+str);
		System.out.println("Strbf:"+strbf);
		System.out.println("Strbld:"+strbld);
		
		String str2=strbf.toString();
		String str3=strbld.toString();
		

// with the help of the toString() method we can convert the either of the classes i.e.
		//Stringbuffer and Stringbuilder to the string.
		
		//and to convert the string to these classes we can use the constructor of the
		//specific classes.
		
		//while there is no direct way to convert the stringbuffer to strinbuilder and 
		//vice-versa but we can do it with the help of the toString() method
		//and then pass this String to the constructors of the specific classes.

	}

}
