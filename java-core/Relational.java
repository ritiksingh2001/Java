package CoreJava;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		//creating Scanner class to take input from user
				Scanner sc=new Scanner(System.in);
				
				//getting input value from user 
			        System.out.println("Enter the first value: ");
				int num1=sc.nextInt();
				
				System.out.println("Enter the second value: ");
				int num2=sc.nextInt();
				
				System.out.println("Enter third number:");
				int num3=sc.nextInt();
				
				//  Equal to operation 
				System.out.println(" num1==num2==num3 : " + (num1==num2)+ " "+(num1==num3));
				
				//Not equal to operation 
				System.out.println(" num1!=num2!=num3 : " + (num1!=num2) +" " + (num1!=num3));
				
				// Greater than operation 
				System.out.println(" num1>num2>num3 : " + (num1>num2) + " " +(num1>num3));
				
				//Less than operation 
				System.out.println(" num1<num2<num3 : " + (num1<num2)+" " +(num1<num3));
				
				//Greater than or equal to operation
				System.out.println(" num1>=num2>=num3 : " + (num1>=num2)+" "+(num1>=num3));
				
				//Less than or equal to operation 
				System.out.println(" num1<=num2<=num3 : " + (num1<=num2)+" " +(num1<=num3));
			

		


	}

}
