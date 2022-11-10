package CoreJava;

import java.util.Scanner;

class SubtractionArray {

	public static void main(String[] args) 
	{
		int n,m;
	    Scanner sc =new Scanner (System.in);
	    System.out.println("enter the number of rows ");
	    n =sc.nextInt();
	    System.out.println("enter the column ");
	    m=sc.nextInt();
	    int arr[][]=new int [n][m];
	    int crr[][]=new int [n][m];
	    int aaa[][]=new int [n][m];
	    System.out.println("enter the elements of 1st matrix:");
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<m;j++)
	    	{
	    		arr[i][j]=sc.nextInt();
	    	
	    	System.out.println();
	    	}
	    }
	  System.out.println("enter the element of 2nd matrix");
	  for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<m;j++)
	    	{
	    		crr[i][j]=sc.nextInt();
	    	
	    	System.out.println();
	    	}
	    }
	  System.out.println("sub of the two matrix:");
	  for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<m;j++)
	    	{
	    		aaa[i][j]=arr[i][j]- crr[i][j];
	    	
	    	}
		}
		  for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<m;j++)
		    	{
		    	
		    	System.out.print(aaa[i][j]+" ");
		    	}
		    	System.out.println();
		    }
	    }
}
