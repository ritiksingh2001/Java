// In the program we use (Switch) case and printing week days 
package CoreJava;

import java.util.Scanner;

class Switch {

	public static void main(String[] args) 
	{
             //creating object of Scanner class
		Scanner sc=new Scanner(System.in);
	     //getting input from user
		System.out.println("Enter a number from 'A' to 'G':");
	     String n=sc.nextLine();
	    //using switch to match the cases with user choice 
	     switch(n)
	     { case "A":
	           {
	        	   System.out.println("Monday");
	           }
	           break;
	     case "B":
	          {
	        	  System.out.println("Tuesday");
	          }
	          break;
	     case "C":
	          {
	        	  System.out.println("Wednesday");
	          }
	          break;
	     case "D":
	          {
	        	  System.out.println("Thrusday");
	          }
	          break;
	     case "E":
	         {
	        	 System.out.println("Friday");
	         }
	         break;
	     case "F":
	          {
	        	  System.out.println("Saturday");
	          }
	          break;
	     case "G":
	          {
	        	  System.out.println("Sunday");
	          }
	          break;
	    default:
	          {
	        	  System.out.println("Invalid number");
	          }
	          break;	  
	     }
	}
}
