//Program  to while loop continues until entered number is positive.
//Take the input from the user
package CoreJava;

import java.util.Scanner;

class WhileLoop {

	public static void main(String[] args)
	{//creating object of Scanner class
	  Scanner sc= new Scanner(System.in);
	  //getting input from user
	  System.out.println("Enter the number:");
	  int n=sc.nextInt();
	 //using (while) for checking condition 
	  while(n>=0)
	  {
		  System.out.print(n+" ");
		  n=sc.nextInt();
	  }
    }
}
