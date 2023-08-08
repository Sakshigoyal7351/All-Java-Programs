package interfaces;

interface inter
{
	static void hello()
	{
		System.out.println("hello world");
	}
	
	default void show()
	{
		System.out.println("this is default method of interfaces");
		display();
	}
	
	
	private void display(){
		{
			System.out.println("this is private method of interfaces");
		}
	}
}

public class interface_ex2 implements inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inter.hello();
		
		interface_ex2 obj = new interface_ex2();
		
		obj.show();
		
		
	}

}
