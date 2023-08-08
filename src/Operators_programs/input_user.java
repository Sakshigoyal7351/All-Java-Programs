package Operators_programs;

import java.util.Scanner;

public class input_user {

	public static void main(String[] args) {
//		int r;
//		double area;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the radius :");
//		r = sc.nextInt();
//		
//		area = 3.14*r*r;
//		
//		System.out.println("perimeter of circle="+area);
		
		String name;
		int age;
		double marks;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the name");
		name= sc.next();
		
		System.out.println("enter the age");
		age= sc.nextInt();
		
		System.out.println("enter the marks");
		marks= sc.nextDouble();
		
		System.out.println("  name="+name+"  age="+age+"  marks="+marks);
		
		
		
		

	}

}
