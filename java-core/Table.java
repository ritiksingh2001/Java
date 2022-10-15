//program to print table of a given number
package CoreJava;

import java.util.Scanner;

class Table {

	public static void main(String[] args) 
	{    //creating object of  Scanner class 
	     Scanner sc = new Scanner(System.in);
	    //taking input from user
	     System.out.println("Enter a number you want to print table of:");
	     int n= sc.nextInt();
	     //using for-loop to print table
	     for(int i=1;i<=10;i++)
	     {
	    	 System.out.println(n + "*" + i+ "="+ (n*i));
	     }
	}
}
