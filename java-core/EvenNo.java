package CoreJava;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array ");
		int a = sc.nextInt();
		 //declaring array 
		System.out.println("Enter 10  elements");
		int arr[]=new int [a];
	        //Traversing the array
	       for(int i=0;i<a;i++)
	       {arr[i]=sc.nextInt();}
	       //Traversing the array again 
	       for(int i=0;i<a;i++)
	       {
	    	   if (arr[i]%2==0)
	    	   { System.out.println(arr[i]);}
	    	   
	       } 
      }
}
