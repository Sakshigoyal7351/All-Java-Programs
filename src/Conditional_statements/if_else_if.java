package Conditional_statements;

import java.util.Scanner;

public class if_else_if {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a;
		int b;
		int c;
//		
//		
		System.out.println("enter a");
		a=sc.nextInt();
		
		System.out.println("enter b");
		b=sc.nextInt();
		
//		
		System.out.println("enter c");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else 
		{
			System.out.println("c is greater");
		}
//		
		
		
//		int n;
//		System.out.println("enter any number");
//		n=sc.nextInt();
//		
//		if(n>0)
//		{
//			System.out.println("no is positive");
//		}
//		else if(n<0)
//		{
//			System.out.println("no is negative");
//		}
//		else 
//		{
//			System.out.println("no is zero");
//		}
//		

	}

}
