package miscellenious.demo;

public class Copying4 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		Height ht=new Height();
		
		ht.ht=67;
		
		Height ht2=new Height();
		ht2.ht=78;
		
		Actress a=new Actress(67,"mahi",ht);
	
		
		Actress b=(Actress)a.clone();
		b.name="Gavale";
		b.ht.ht=78;
		
		
		
		
		System.out.println(b.ht.ht);
		System.out.println(a.ht.ht);
		
		

	}

}


class Actress  implements Cloneable{
	
	int id;
	String name;
	Height ht;
	
	
	public Actress(int id,String name,Height ht)
	{
		this.id=id;
		this.name=name;
		this.ht=ht;
	}
	protected Object clone() throws CloneNotSupportedException{
		
	
		Actress at=(Actress) super.clone();
		at.ht=(Height)ht.clone();
		
		return at;
	}
	
}


class Height implements Cloneable {
	int ht;
	
	
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		
	}
}