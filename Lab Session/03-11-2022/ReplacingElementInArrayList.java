/*
 Program: Program to find to replace the second element of a ArrayList with
  the specified element
 Author: Ritik Singh
 Date: 03/11/2022
 */
package Collection;

import java.util.*;

class ReplacingElementInArrayList {

	public static void main(String[] args) 
	{   Scanner sc=new Scanner(System.in);
	//creating arraylist
		ArrayList<Integer> ob=new ArrayList<Integer>();
	//adding object in arraylist
	ob.add(4);
	ob.add(2);
	ob.add(5);
	ob.add(8);
	//printing the Arraylist
	System.out.println("array list:"+ob);
	//entering the element want to replace
	System.out.println("enter the element u want to replace :");
	int n=sc.nextInt();
	//replacing element at index 1
	ob.set(1,n);
	//printing final arraylist after replacing
	System.out.println("array list after replacing:"+ob);
  }
}
