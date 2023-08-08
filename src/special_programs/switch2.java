package special_programs;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Boolean z= true;
		
		while(z)
		{
		
			System.out.println("___________________________________________________________________________________");
		
			System.out.println();
		System.out.println(" press 1 to find sum of digit");
		System.out.println(" press 2 to check no is armstrong or not");
		System.out.println(" press 3 to find reverse of number");
		System.out.println(" press 4 to check given no is palindrome or not");
		System.out.println(" press 5 to Exit");
		System.out.println();
		System.out.println("___________________________________________________________________________________");
	
	
		
		System.out.println("choose any number between 1 to 5");
		int ch,n,r,sum=0;
		ch= sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("enter any number");
			n= sc.nextInt();
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum= sum+r;
				
			}
			System.out.println("sum of digit is: "+sum);
			
			break;
		case 2: 
			System.out.println("enter any number");
			n= sc.nextInt();
			
			int t=n;
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum= sum+r*r*r;
				
			}
			if(sum==t)
			{
				System.out.println(t+" is an armstrong no");
			}
			else 
			{
				System.out.println(t+"is not an armstrong no");
			}
			
			
		break;
		
		
		case 3:
			System.out.println("enter any number");
			n= sc.nextInt();
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum= (sum*10)+r;
				
			}
		
			System.out.println("reverse of the number is : "+sum);
		
			break;
			
			
		case 4:
			
			System.out.println("enter any number");
			n= sc.nextInt();
			int g=n;
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum= (sum*10)+r;
				
			}
			
			if(sum==g)
			{
				System.out.println("no is palindrome");
			}
			else 
			{
				System.out.println(" no is not palindrome");
			}
			
			break;
			
			
			
			
		case 5:
			z=false;
			break;
			
			
		default:
			System.out.println("wrong choice...!!! go for another choice!!");
		}

		}
	}

}
