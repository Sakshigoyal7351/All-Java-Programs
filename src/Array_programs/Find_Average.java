package Array_programs;

import java.util.Scanner;

public class Find_Average {

	public static void main(String[] args) {
		
		int i,n;
		double avg,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of elements ");
		n=sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("enter the elements of array");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			sum=sum+a[i]; // sum+=a[i];
		}
		
		avg = sum/n;
		
		System.out.println("average is : "+avg);

	}

}
