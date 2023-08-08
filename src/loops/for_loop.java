package loops;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		int i;
//		for(i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
		
//		for(i=100;i>=1;i--)
//			{
//				System.out.println(i);
//			}
		
//		for(i=1;i<=100;i++)
//		{
//			if(i%2==0)
//			{
//			System.out.println(i);
//			}
//		}
		
//		for(i=1;i<=100;i=i+2)
//		{
//			System.out.println(i);
//		}
		
//		int sum=0;
//		for(i=1;i<=100;i=i+1)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//				sum=sum+i;
//			}
//			
//			
//		}
//		
//		System.out.println("sum of series :"+sum);
		
		Scanner sc = new Scanner(System.in);
		
		//int n,t=1;
//		System.out.println("enter any number");
//		n= sc.nextInt();
//		for(int j=1;j<=5;j++)
//		{
//			for(i=1;i<=10;i++)
//			{
//				t = j*i;
//				System.out.println(j+"x"+i+"="+t);
//				
//				
//				
//			}
//			System.out.println();
//		}
		
		
		
		int n,f=1;
		System.out.println("enter any number");
		n= sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f=f*i;
			
		
		}
		System.out.println("factorial of "+n+" is : "+f);
		
		

	}

}
