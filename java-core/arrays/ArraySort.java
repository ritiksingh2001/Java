/*
 program: program to find to sort int array in Ascending order.
 author: Ritik Singh
 date: 27/10/2022
 */
package CoreJava;

import java.util.Scanner;

class ArraySort {

	public static void main(String[] args) 
	{
	      int temp;
	      Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the size of array:");
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      System.out.println("Enter the array elements ");
	      for(int i =0;i<n;i++)
	      { 
	    	  arr[i]=sc.nextInt();
	      }
          for(int i=0;i<n;i++)
          {
        	 for(int j=i+1;j<n;j++)
        	 {
        		 if(arr[i]>arr[j])
        		 {
        			
        			 temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp;
        		 }
        	 }
          }
            System.out.println("Arrays elements in ascending order:");
            for(int i=0;i<n-1;i++)
            {
            	System.out.print(arr[i]+ ",");
            }
            System.out.print(arr[n-1]);
      }
}
