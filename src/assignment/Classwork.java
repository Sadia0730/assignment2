package assignment;

import java.util.Scanner;
public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double x,y;
		char op;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: "); 
		x=sc.nextDouble();
		System.out.println("Enter operator: "); 
		op=sc.next().charAt(0);
		System.out.println("Enter a number: "); 
		y=sc.nextDouble();
		
   if(op=='+')
   {
	  System.out.println(x+y);
   }
   if(op=='-')
   {
	   System.out.println(x-y);
   }
   if(op=='*')
   {
	   System.out.println(x*y);
   }
   if(op=='/')
   {
	   System.out.println(x/y);
   }
	}

}
