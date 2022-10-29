/*
 Program: program to Print Happy Diwali using any loop.
 Author :Ritik Singh
 Date: 27/10/2022
 */
package CoreJava;

import java.util.Scanner;

class WhileLoop2 {

	public static void main(String[] args)
	{
	   Scanner sc= new Scanner (System.in);
	  System.out.println("Enter how many times you want to print the message:");
	   int n=sc.nextInt();
	   int i=0; 
	      while(i<n)
	      {
	    	  System.out.println("Happy Diwali ");
	    	  i++;
	      }
	 }
}
