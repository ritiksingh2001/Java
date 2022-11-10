/*
 Program: Program to find to change PriorityQueue to maximum Priorityqueue Using Any loop
 Author: Ritik Singh
 Date: 03/11/2022
 */
package Collection;

import java.util.*;

class PriorityQueue_Ex {

	public static void main(String[] args)
	{ // Creating an object of PriorityQueue class
		PriorityQueue<Integer> object = new PriorityQueue<>(Collections.reverseOrder());
	      
		   // Add numbers in the Queue
		object.add(10);
		object.add(22);
		object.add(36);
		object.add(25);
		object.add(16);
		object.add(70);
		object.add(82);
		object.add(89);
		object.add(14);
		
			//Printing Original priority queue
		   System.out.println("Original Priority Queue: "+object);
		   
		   //Printing Maximum priority Queue
		System.out.print("Maximum Priority Queue");
				Integer val = 10;
				//using while loop
				while( ( val = object.poll()) != null) {
				    System.out.print(val+"  ");
				      }
					  System.out.print("\n");
		}
}
