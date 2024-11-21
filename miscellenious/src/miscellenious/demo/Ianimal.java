package miscellenious.demo;

public interface Ianimal {

	
	
	void name();
	
	
	
	 default public void run()
	{
		System.out.println("the run method from the animal interface !");
	}
	
	
	static int returnzero()
	{
		return 0;
	}
}



interface Ianimal2{
	
	
	
	default public void run()
	{
		System.out.println("from interface 2 !");
	}
	
	static int returnzero()
	{
		return 1;
	}
}