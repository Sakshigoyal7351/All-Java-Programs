package special_programs;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		
		int n,r,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n= sc.nextInt();
		
		int t=n;
		
		while(n>0)
		{
			r= n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		
		System.out.println("sum of digits : "+sum);
	//	System.out.println("no is: "+n);
		
		if(sum==t)
		{
			System.out.println("no is armstrong");
			
		}
		else
		{
			System.out.println("no is not armstrong");
		}
		

	}

}
