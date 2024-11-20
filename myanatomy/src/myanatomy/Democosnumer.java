package myanatomy;

public class Democosnumer {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		System.out.println(cal.add(12.0f, 12.0f));
		System.out.println(cal.add(12, 12));
		
		
	}

}



class Calculator
{
	
	
public int add(int i, int j)
{
	return i+j;
}
	
	
	public float add(float i,float j)
	{
		return i+j;
	}
	
}