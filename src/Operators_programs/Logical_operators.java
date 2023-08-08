package Operators_programs;

public class Logical_operators {

	public static void main(String[] args) {

		System.out.println((5>3) && (8>5)); // t &&  t  t
//		
		System.out.println((5>3) && (8<5));// t   f f//		
		System.out.println((5>3) || (8>5)); // t   t 
//		
		System.out.println((5<3) || (8>5)); // f   t  
		System.out.println((5<3) || (8<5));  //f    f =f 
//		
//		
		System.out.println(!(5>3));
		
		

	}

}
