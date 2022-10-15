/*
 Program: program for checking the Leap year by taking data input from user 
 Author : Ritik Singh
 Date : 06/10/2022 
 */
package CoreJava;

import java.util.Scanner;

class LeapYear {

	public static void main(String[] args) 
	{  //creating scanner object to take input from user
	     Scanner sc= new Scanner(System.in);
	   //getting input value from user
	     System.out.println("Enter the year:");
	      int year = sc.nextInt(); 
	      isleap(year);
	}

    //method checking for the leap year
    public static void isleap(int year)
    {    boolean leapyear=false;
        //using if else if for checking the condition  
       if(year %4==0)//to check the year is divisible by 4
         {
        	 leapyear=true;
        	 
        	 if(year%100==0)//checking the year is century year or not
        	 {
        		 if(year%400==0)
        		 {
        			 leapyear=true;
        		 }
        		 else
        		 {
        			 leapyear=false;
        	     }
             }
         }
         
         else
         
        	 leapyear=false;
        	 if(!leapyear)
        	 {
        		 System.out.println(year + " is a Non Leap-year");
        	 }
        	 else
        	 {
        		 System.out.println(year + " is a Leap-year");
        	 }
     }
}
