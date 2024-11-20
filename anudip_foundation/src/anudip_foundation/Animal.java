package anudip_foundation;

public class Animal {
	
	//Parent class, Super class
	public void name()
	{
		System.out.println("name from Animal !");
	}

}


class Cat extends Animal{
	
	//Child class, Sub Class
	
	public void run()
	{
		System.out.println("cat is running !");
	}
	
}


class Tom extends Animal{
	
	
	public void runtom()
	{
		System.out.println("tom is running !");
	}
	
}


class Harry extends Tom{
	
}