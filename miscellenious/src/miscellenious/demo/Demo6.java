package miscellenious.demo;

public class Demo6 {

	public static void main(String[] args) {
		
		d d=new d();
		d.run();
		
		d.name();
		
	}

}


class d implements Ianimal,Ianimal2{

	@Override
	public void name() {
	
	System.out.println(Ianimal.returnzero());
	}
	
	public void run()
	{
		Ianimal.super.run();
		Ianimal2.super.run();
	}
	
}