package special_programs;

import java.util.Scanner;

public class Sun_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,r,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n= sc.nextInt();
		
		while(n>0)
		{
			r= n%10;
			n=n/10;
			sum=sum+r;
		}
		
		System.out.println("sum of digits : "+sum);
		
		
		
		

	}

}
