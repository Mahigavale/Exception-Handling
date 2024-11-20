package miscellenious.demo;

public class Demo2 {

	public static void main(String[] args) {

		
		
		Hotel h=new Hotel() {
			public void hotel_name()
			{
				System.out.println("hotel name form the anonymous class.");
			}
		};
		
		
		h.hotel_name();
		System.out.println(h.getClass());
	}

}


class Hotel{
	
	
	
	public void hotel_name()
	{
		System.out.println("hotel_name");
	}
}