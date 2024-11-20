package miscellenious.demo;

public class Demo3 {

	public static void main(String[] args) {
		
		MovieBookingApp Mahesh=new MovieBookingApp();
		
		MovieBookingApp Dipak=new MovieBookingApp();
		
		Mahesh.seats=7;
		Dipak.seats=9;
		
		Mahesh.start();
		Dipak.start();
	
	}

}



class BookSeats
{
	
	int total_seats=10;
	
	public void bookSeats(int seats)
	{
		if(seats<total_seats)
		{
			System.out.println("seats booked sucessfully...!");
			System.out.println("Total seats are remaining:"+(total_seats-seats));
		}
		
		else
		{
			System.out.println("seats cannot be booked !");
			System.out.println("total seats are L"+total_seats);
		}
	}
	
}

class MovieBookingApp extends Thread{
	
	BookSeats b=new BookSeats();
	int seats;
	
	public void run()
	{
		
		b.bookSeats(seats);
	}
}