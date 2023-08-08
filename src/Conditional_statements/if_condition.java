package Conditional_statements;

import java.util.Scanner;

public class if_condition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("enter your age ");
		a=sc.nextInt();
		
		if(a>=18)
		{
			System.out.println("person is eligible to vote");
		}
		
		int n;
		System.out.println("enter your no");
		n= sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("no is even ");
		}
		 
		if(n%2==1)
		{
			System.out.println("no is odd");
		}

	}

}
