/*
 Program: Program to find to check if a particular element exist in a Linked List
 Author: Ritik Singh
 Date: 03/11/2022
 */
package Collection;

import java.util.*;
class Check_LinkedList {

	public static void main(String[] args)
	{  Scanner sc =new Scanner (System.in);
	//creating Linkedlist
		LinkedList<Integer> ob= new LinkedList<>();
		//adding object in Linkedlist
	    ob.add(5);
	    ob.add(6);
	    ob.add(9);
	    ob.add(7);
	  //printing the Linkedlist
	    System.out.println("enter the element you want to search:");
	    int n=sc.nextInt();
	    //checking the element 
	    boolean s= ob.contains(n);
	    if(s)
	    {
	    	System.out.println("yes the element is present");
	    }
	    else
	    {
	    	System.out.println("no the element is not present");
	    }
    }
}
