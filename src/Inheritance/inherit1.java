package Inheritance;

class A
{
	public void work()
	{
		System.out.println("hi i am working");
	}
}


class B extends A
{
	public void play()
	{
		System.out.println("hii i am playing");
	}
}

class C extends A
{
	public void eat()
	{
		System.out.println("hii i am eating ");
	}
}

public class inherit1 {

	public static void main(String[] args) {
		
		
		C obj3= new C();
		obj3.eat();
//		obj3.play();
		obj3.work();
		
//		
//	
//		B obj = new B();
//		obj.play();
//		obj.work();
//		
//		
//		A obj2 = new A();
//		
//		obj2.work();
//	//	obj2.play();
//		

	}

}
