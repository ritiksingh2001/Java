// Test whether the person is eligible to give vote using (if-else)

package CoreJava;

import java.util.Scanner;

class IfElse {

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age= sc.nextInt();
		// using if-else 
		if(age>18)
		{
			System.out.println(" You are eligible to vote.");
		}
		else
		{
			System.out.println("Sorry! you are not eligible to vote.");
		}
    }
}
