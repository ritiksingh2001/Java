/*
 program: program to reverse the number given by user
 author: Ritik Singh
 date;06/10/2022
 */

package CoreJava;

import java.util.Scanner;

class ReverseTheNumber {

	public static void main(String[] args) 
	{   
		//creating scanner object to take input from user 
		Scanner sc =new Scanner (System.in);
		//getting input value from user
		System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    int rev=0;
            if(num>0)
	    {
	    //using while loop for reversing the number
	    while(num!=0)
	    { 
	    	int rem=num%10;
	    	rev = rev*10 + rem;
	    	num/=10;
	    }
	    }
	    else
	    { System.out.println("Please enter the greater than zero")
	    }
		System.out.println("The reverse of the given number is:" + rev);
	}
}
