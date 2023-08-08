package Array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the totral number of elements ");
		int n= sc.nextInt();
		int i;
		
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		System.out.println("enter first array elements : ");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("enter second array elements : ");
		for(i=0;i<n;i++)
		{
			b[i]= sc.nextInt();
		}
		

		int c[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			c[i] = a[i]+b[i];
		}
		
		System.out.println("sum array is:");
		
		for(i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
		
		int d[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			d[i]=a[i];
			a[i]=b[i];
			b[i]=d[i];
		}
		
		System.out.println("first array is: \n");
		
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		

		System.out.println("\nfirst array is: \n");
		
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]);
		
	}

}
}
