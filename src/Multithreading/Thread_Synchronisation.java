package Multithreading;

class Bookurshow
{
	int total_seats=10;
	
	public void bookseat(int seats)
	{
		
		System.out.println("hiii...!!"+Thread.currentThread().getName());
		synchronized (this) {
			
			//System.out.println("hiii...!!"+Thread.currentThread().getName());
		if(total_seats>=seats)
		{
			System.out.println("seats booked successfully");
			total_seats= total_seats-seats;
			System.out.println("left seats="+total_seats);
		}
		
		else
		{
			System.out.println("seats can not be booked");
			System.out.println("avaliable seats are: "+total_seats);
		}
		
		//System.out.println("bye...."+Thread.currentThread().getName());
		}
		
		
		System.out.println("bye...."+Thread.currentThread().getName());
	}
}


public class Thread_Synchronisation extends Thread{
	
	static Bookurshow b;
	
	int seats;
	
	public void run()
	{
		b.bookseat(seats);
	}

	public static void main(String[] args) {
		
//		Bookurshow sumit = new Bookurshow();
//		sumit.bookseat(7);
//		
//		Bookurshow sonia = new Bookurshow();
//		sumit.bookseat(6);
		
		b= new Bookurshow();
		
		Thread_Synchronisation sumit = new Thread_Synchronisation();
		sumit.seats=7;
		sumit.setName("sumit thread");
		sumit.start();
		
		Thread_Synchronisation sonia = new Thread_Synchronisation();
		sonia.seats=6;
		sonia.setName("sonia thread");
		sonia.start();
		
		

	}

}
