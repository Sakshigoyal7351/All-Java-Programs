package Operators_programs;

public class Relational_operator {

	public static void main(String[] args) {
		int a=1;
		int b=10;
		
		System.out.println(a>b); //(1>10) false   
		System.out.println(a<b); //(1<10) true
		System.out.println(a==b);//f
		System.out.println(a!=b);//t
		System.out.println(a>=b);//(1>=10) f    ((a>10)||(a==10))
		System.out.println(a<=b);// (a<b)(a==b) t

	}

}
