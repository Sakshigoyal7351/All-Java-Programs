package Multithreading;

class th1 extends Thread
{
	public void run()
	{
		System.out.println("task1");
	}
}

class th2 extends Thread
{
	public void run()
	{
		System.out.println("task2");
	}
}
public class prog3 {

	public static void main(String[] args) {
		th1 t1= new th1();
		t1.start();
		th2 t2 =new th2();
		t2.start();
	}

}
