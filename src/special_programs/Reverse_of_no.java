package special_programs;

import java.util.Scanner;

public class Reverse_of_no {

	public static void main(String[] args) {
	
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n= sc.nextInt();
		int sum=0;
		int r;
		
		while(n>0)
		{
			r= n%10;
			n=n/10;
			sum=(sum*10)+r;
			
		}
		
		System.out.println("reverse of no is : "+sum);

	}

}
