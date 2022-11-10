package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

class ArraySort2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the size of aray");
         int n=sc.nextInt();
      
	    System.out.println("array is ");
	    int arr[] = new int[n];
         for( int i=0;i<n;i++)
        {  arr[i]=sc.nextInt();}
        
        Arrays.sort(arr);
        System.out.println("sortedd array is ");
      
        for( int i:arr)
        {System.out.print(i+" ");}
	}
}
