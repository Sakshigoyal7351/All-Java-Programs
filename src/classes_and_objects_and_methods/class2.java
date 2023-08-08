package classes_and_objects_and_methods;

class ABC
{
	 public int c,d;
	public void sum()  //NANR
	{
		System.out.println("sum="+(10+20));
	}
	
	public int sub() //NAWR
	{
		int a=10;
		int b=5;
		int c;
		c=a-b;
		return c;
	}
	
	public void mul(int a, int b)   //wanr
	{
		
		System.out.println("multiplication="+(a*b));
	}
	
	public int division(int a, int b)     //wawr
	{
		return (a/b);
	}
}

public class class2 {

	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.sum();
		System.out.println("subtraction="+obj.sub());
		obj.mul(10,20);
		System.out.println("division ="+obj.division(200,100));
		
		obj.c=20;
		obj.d=2;
		
		
		System.out.println("c="+obj.c);
		System.out.println("d="+obj.d);
		
		

	}

}
