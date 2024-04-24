package com.learning.day6and8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListIntro {

	public static void main(String[] args) {
	
//		 1. ArrayList 
//		 2. LinkedList 
//		 3. Vector
//		 4. Stack.
		
		
//		1.  ArrayList 
		
//         ArrayList<Datatype> variableName = new ArrayList<Datatype>();
		
		
		 ArrayList<String> names = new ArrayList<String>();
		  names.add("roy");
		  names.add("joy");
		  names.add("jack");
		  names.add("kim");
		
		  System.out.println(names.size());
		  System.out.println(names);
		  System.out.println(names.remove(0));
		  System.out.println(names);
		  names.add(1, "ana");
		  System.out.println(names);
		  
//		  1. search based on Index -> O(1)
//		  2. search for arbitary item without index  -> O(N)
//		  3. insert at the end  -> O(1)
//		  4. inserting to the arbitary position -> O(N)
//		  5. remove last item -> O(1)
//		  6. remove item at arbitary position -> O(N)
		  
		  // we have to shift alot whenever  we are updating the items in arraylist.
		  
//	----------------------------------------------------------------------
		  
		  // Linked List
		  
		  // startingNode -> HeadNode
		  
		  // Node -> data, next 
		  
		  // data -> contains the values 
		  // next -> contains the address of next item.
		  
		  // Only through head node we can access all other items.
		  
		  // Items are not storing next to eachother, 
		  
//		  1. search of first item -> O(1)
//		  2. search for arbitary item  -> O(N)
//		  3. insert at the first  -> O(1)
//		  4. inserting to the arbitary position -> O(N)
//		  5. remove first item -> O(1)
//		  6. remove item at arbitary position -> O(N)
		  
		  // Linked List is used when there are more updates.
		  
		 
//        LinkedList<Datatype> variableName = new LinkedList<Datatype>();  
		  
		   LinkedList<Integer> numbers = new LinkedList<Integer>();
		   numbers.add(100);
		   numbers.add(200);
		   numbers.add(300);
		   numbers.add(400);
		   
		   numbers.addFirst(500);
		   numbers.addLast(800);
		   
		   System.out.println(numbers);

		   System.out.println(numbers.size());
		   numbers.removeFirst();
		   numbers.removeLast();
		   
		   System.out.println(numbers);
		   
//		   -----------------------------------------------
//		    Vector 
		   
//		    its a similier to arrayList 
//		    its a synchronized -> every operation it will lock the resource and unlock after the opration.
//          --------------------------------------------------------------
//		    Stacks 
		   
//		    its a synchronized, -> uses vector.
//		   -> LIFO structure -> Last In First Out
		   
//		   -> pop() -> removes the top element
//		   -> push() -> add the element at the top of DS
//		   -> peek() -> values of top element.
		   
		   // Stack memory is special location in RAM.
		   
		   
//		   Stack<Datatype> variableNAme  = new <Datatype>Stack();
		   
		   Stack<Integer> stack1 = new Stack<Integer>();
		   
		   stack1.push(100);
		   stack1.push(500);
		   stack1.push(200);
		   stack1.push(600);
		   stack1.push(800);
		   
		   System.out.println(stack1);
		   
		   System.out.println(stack1.peek());
		   System.out.println(stack1.pop());
		   
		   System.out.println(stack1);
		   
	}

}
