package CoreJava;

import java.util.Scanner;

public class OddNo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array should be more than 10 ");
		int a = sc.nextInt();
		int sum=0;
		 //declaring array 
		System.out.println("Enter 10  elements");
		int arr[]=new int [a];
	        //Traversing the array
	       for(int i=0;i<a;i++)
	       {arr[i]=sc.nextInt();}
	       //Traversing the array again 
	       for(int i=0;i<a;i++)
	       {    
	    	   if (arr[i]%2!=0)
	    	   {sum = sum+arr[i];}
	        } 
		System.out.println("sum of odd elements in array is: "+ sum);
	}
}
