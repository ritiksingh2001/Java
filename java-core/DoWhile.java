//program to demonstrate (do-while) and print the reverse counting from
//the user input number
package CoreJava;

import java.util.Scanner;

class DoWhile {

	public static void main(String[] args)
	{   
            //creating object of Scanner class
		Scanner sc=new Scanner(System.in);
	    //getting input from user
		System.out.println("Enter a number:");
	     int n=sc.nextInt();
	    //using (do-while) to print reverse counting
	     do 
	     {
	    	 System.out.print(n +" ");
	    	 n--;
	     }while(n>=0);
	}
}
