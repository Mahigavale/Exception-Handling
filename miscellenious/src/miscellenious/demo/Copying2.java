package miscellenious.demo;

public class Copying2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Farmaddress add=new Farmaddress(77);
		
		
		Farmer f1=new Farmer(23,"Mahesh",add);
		
		
		Farmer f2=(Farmer)f1.clone();
		
		f2.farmername="ARRRRR";
		
		System.out.println(f1.farmername);
		System.out.println(f2.farmername);
		
		f2.add.farmaddressid=67;
		
		
		System.out.println(f1.add.farmaddressid);
		System.out.println(f2.add.farmaddressid);
		
		
		//this is the shallow copy concept where the primitive will behave as intended
		//but the catch is that if we add some variables which are not primitive
		//then the clone will fail and give the same output.
		
	}

}

class Farmer implements Cloneable{
	
	
	int farmerid;
	String farmername;
	
	Farmaddress add;
	
	
	public Farmer(int farmerid,String farmername,Farmaddress add)
	{
		this.farmerid=farmerid;
		this.farmername=farmername;
		this.add=add;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		Farmer farmer=(Farmer)super.clone();
		farmer.add=(Farmaddress)add.clone();
		
		return farmer;
	}
}

class Farmaddress implements Cloneable{
	
	int farmaddressid;
	
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public Farmaddress(int farmaddressid)
	{
		this.farmaddressid=farmaddressid;
	}
}