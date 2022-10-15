/*
 program: program for Calculation (taking 3 input variable, 2 for operators and 1 for operands and perfrom "+,-,*,/" operation)
 Author:Ritik Singh
 Date: 29/09/2022
 */
package CoreJava;

import java.util.Scanner;

class Calculation {
	public static void main(String[] args)
	{    //creating scanner object to take input from user 
		   Scanner sc=new Scanner(System.in);
		   //getting input value from user
		   System.out.println("enter first number:");
		   int num1=sc.nextInt();
		   System.out.println("enter second number:");
		   int num2=sc.nextInt();
		   System.out.println("press 1 for addition; press 2 for subtraction; press 3 for multiplication; press 4 for divison;");
		   int choice=sc.nextInt();
		 //using if else if for checking the condition  
		   if (choice==1)
		  {  num1+=num2;
			  System.out.println("num1+num2=" + num1 );
		  }
		  else if(choice==2)
		  {  num1-=num2;
			  System.out.println("num1-num2=" + num1 );
		  }
		  else if(choice==3)
		  { num1*=num2;
			  System.out.println("num1*num2="+ num1);
		  }
		  else if(choice==4)
		  {  num1/=num2;
			  System.out.println("num1/num2="+ num1);
		  }
		  else
		  {
			  System.out.println("Oops! wrong press , Try again:");
		  }
    }
}
