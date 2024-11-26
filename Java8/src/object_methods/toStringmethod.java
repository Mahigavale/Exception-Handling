package object_methods;

import java.util.Objects;

public class toStringmethod {

	public static void main(String[] args) {
		
		
		demo d=new demo(12,"mahesh");
		Object ob=new demo(12,"mahesh");
		
		
		demo d2=new demo();
		demo d3=new demo();
		
		d2.id=23;
		d2.name="Ashok";
		
		d3.id=23;
		d3.name="Ashok";
		
		
		System.out.println(d2.equals(d3));
		
		
		System.out.println(d);
		
		System.out.println(d.equals(ob));
		
		System.out.println(d.hashCode());
		System.out.println(ob.hashCode());

	}

}
class demo
{
	
	public int id;
	public String name;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		demo other = (demo) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public demo()
	{
		
	}
	
	public demo(int id, String name)
	{
		this.id=id;
		this.name=name;
	}


	@Override
	public String toString() {
		return "demo :" + id +" name :"+ name; 
	}
	
	
}