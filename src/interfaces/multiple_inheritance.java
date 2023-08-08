package interfaces;

interface A
{

	 void M1();
}

interface B
{
	void M2();
	
}

class c implements A,B
{

	@Override
	public void M2() {
		System.out.println("method 2");
		
	}

	@Override
	public void M1() {
		System.out.println("method 1");
		
	}
	
}

public class multiple_inheritance {

	public static void main(String[] args) {
		

		c obj = new c();
		obj.M1();
		obj.M2();
		
	}

}
