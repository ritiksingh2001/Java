/*
 Program: Finding the largest number between two numbers.
 Author: Ritik Singh
 Date: 29/09/2022 
 */
package CoreJava;

import java.util.Scanner;

class FindLargestOfTwo {
	public static void main(String[] args)
	{
		 //creating scanner object to take input from user 
		   Scanner sc=new Scanner(System.in);
		   //getting input value from user
		   System.out.println("enter first number:");
		   int num1=sc.nextInt();
		   System.out.println("enter second number:");
		   int num2=sc.nextInt();
		   //comparing both numbers by using (if-else) 
		   if(num1>num2)
		   {
			   System.out.println("num1 is greater ");
		   }
		   else 
		   {
			   System.out.println("num2 is greater ");
		   }
    }
}
