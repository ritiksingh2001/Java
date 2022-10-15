/*
 Demonstrate if-else statement of 5 subjects.the person who gets above 60% will be 
 passed otherwise failed.Output should be like as:Enter your name,Enter marks for the 5 
 subjects.
 */
package CoreJava;

import java.util.Scanner;

class CheckPercent {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your name:");
	  String name= sc.next();
	  System.out.println("Enter marks of 1st Subject:");
	  int m1=sc.nextInt();
	  System.out.println("Enter marks of 2nd Subject:");
	  int m2=sc.nextInt();
	  System.out.println("Enter marks of 3rd Subject:");
	  int m3=sc.nextInt();
	  System.out.println("Enter marks of 4th Subject:");
	  int m4=sc.nextInt();
	  System.out.println("Enter marks of 5th Subject:");
	  int m5=sc.nextInt();
	 
	  //calculating percentage 
	  float per = (m1 + m2 + m3 + m4 + m5)/5;
	  System.out.println(name+ " your percentage is: " + per);
	 
	  // checking the status of student (passed or failed)
	  if(per>=60)
	  {
		  System.out.println("congratulation! "+ name +" you are passed.");
	  }
	  if(per<60)
	  {
		  System.out.println("Sorry! "+ name +" you are failed.");
	  }
	}
}
