package All_Programs;

public class local_variable {
	
	public void abc()// declaration of method 
	{
		// local variables 
		int a=10;
		double b= 3.2;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	
	public static void main(String[] args) {
		
		local_variable obj= new local_variable(); // obj declaration
		
		obj.abc();//calling the method 
		
		

	}

}
