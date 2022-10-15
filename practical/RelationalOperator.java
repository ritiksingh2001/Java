package CoreJava;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		//creating Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		//getting input value from user 
	  System.out.println("Enter the first value: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2=sc.nextInt();
		
		// Equal to operation 
		System.out.println(" num1==num2 :" + (num1==num2));
		
		/ Not equal to operation 
		System.out.println(" num1!=num2 :" + (num1!=num2));
		
		// Greater than operation 
		System.out.println(" num1>num2 :" + (num1>num2));
		
		// Less than operation 
		System.out.println(" num1<num2 :" + (num1<num2));
		
		// Greater than or equal to operation
		System.out.println(" num1>=num2 :" + (num1>=num2));
		
		//Less than or equal to operation 
		System.out.println(" num1<=num2 :" + (num1<=num2));
	}

}
