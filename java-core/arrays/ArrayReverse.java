package CoreJava;

import java.util.Scanner;

class ArrayReverse {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    System.out.println("enter a string");
	   String arr=sc.nextLine();
	   char a[]=arr.toCharArray();
	   System.out.println("reverse of a string is ");
         int i=a.length;
         for(int j=i;j>0;j--)
         {
        	 System.out.print(a[j-1]);
         }
	}     
}
