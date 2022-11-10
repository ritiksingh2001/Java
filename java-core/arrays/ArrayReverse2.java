package CoreJava;

import java.util.Scanner;

public class ArrayReverse2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	System.out.println("enter the array elements ");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
         System.out.println("reverse of a array");
         for(int j=n;j>0;j--)
         {
        	 System.out.print(arr[j-1]+" ");
         }
	}
}
