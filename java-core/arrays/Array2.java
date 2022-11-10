package CoreJava;

import java.util.Scanner;

class Array2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
	       int a=sc.nextInt();
	       //declaeing array 
	       int arr[]=new int [a];
	       System.out.println("Enter the elemnts");
	     //Traversing the array
	       for(int i=0;i<a;i++)
	       {arr[i]=sc.nextInt();}
	       int sum=0;
	       //Traversing the array again 
	       for(int i=0;i<a;i++)
	       { sum = sum+arr[i];}
	       System.out.println("sum of all elements of the array is" + sum );
	       
	}
}
