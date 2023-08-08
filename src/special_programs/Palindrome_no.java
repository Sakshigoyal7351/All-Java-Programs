package special_programs;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n= sc.nextInt();
		int sum=0;
		int r;
		int t=n;
		
		while(n>0)
		{
			r= n%10;
			n=n/10;
			sum=(sum*10)+r;
			
		}
		
		System.out.println("reverse of no is : "+sum);
		
		if(sum==t)
		{
			System.out.println("no is palindrome");
		}
		else 
		{
			System.out.println("no is not palindrome");
		}

	}

}
