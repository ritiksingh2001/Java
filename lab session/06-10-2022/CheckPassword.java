/*
 program: program for checking the password is right or wrong
 Author: Ritik Singh
 Date: 06/10/2022
 */
package CoreJava;

import java.util.Scanner;

class CheckPassword {

	public static void main(String[] args)
	{ //creating scanner object to take input from user 
		Scanner sc= new Scanner(System.in);
		//getting input value from user
		System.out.println("Enter the username:");
		String username= sc.nextLine();
		System.out.println("Enter the password");
		int pw=sc.nextInt();
		//using if-else for checking condition
		if(pw==1234)
		{
			System.out.println(username + " login succesful");
		}
		else
		{
			System.out.println(username + " wrong password! Try again");
		}
	}
}
