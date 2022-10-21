/*
 Program :Program to sort a numeric array and a string array.
 Author: Ritik Singh
 Date: 20/10/2022
 */
package CoreJava;

import java.util.Scanner;

class SortArray {

	public static void main(String[] args) 
	{   Scanner sc = new Scanner (System.in);
	     System.out.println("Enter the size of array");
	     int n = sc.nextInt();
	     System.out.println("Enter the elements of array");
	   //declare the array
	     int a[]= new int[n];
	   //Traversing the array
	     for(int i=0; i<n;i++)
          {a[i]=sc.nextInt();}
	     //Traversing the array
	     for (int i = 0; i < n; i++)   
          {  
               for (int j = i + 1; j < n; j++)   
          {  
              int tmp = 0;  
              if (a[i] > a[j])   
          {  
              tmp = a[i];  
              a[i] = a[j];  
              a[j] = tmp;  
          }  
          } 
           System.out.println("The sorted array is :"+a[i]);
          }
    }
}
