package CoreJava;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
	
		// Creating Objects of scanner class
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter num1 :");
				int num1 = sc.nextInt();
				System.out.println("Enter num2 :");
				int num2 = sc.nextInt();
				
				// adding and assigning value
				num1 += num2;
				System.out.println("num1= :" + num1);

				// Subtracting and assigning value
				num1 -= num2;
				System.out.println("num2 =:" + num2);

				// Multiplying and assigning the value
				num2 *= num1;
				System.out.println("num2 = :" + num2);

				// dividing and  and assigning the value
				num1 /= num2;
				System.out.println("num1 = :" + num1);

				// Modulo and assigning the value
				num1 %= num2;
				System.out.println("num2 =:" + num2);

	}

}
