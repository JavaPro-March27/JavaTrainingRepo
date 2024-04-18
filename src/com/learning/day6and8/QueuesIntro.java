package com.learning.day6and8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuesIntro {

	public static void main(String[] args) {
	
		
		// Queues
		
//		  FIFO => First In First OUT     -> O(1)
		
//		  array list and linkedlist
		
//		  enqueue()  -> insert an item 
//		  dequeue()  -> delete an item 
//		  peek()     -> return a value 
		
		
//		  --- throws exceptions                                  --- returns a value
//		    add()                                                       offer()
//		    remove()                                                    poll()
//		    element()                                                   peek()
		
//		Queues are very useful when a resource is shared with several consumers.
//		queues arew very imp in CPU schedules 
//		queues are stored in queues.
		
		
		

		
//		 Queue<datatype> name = new LinkedList<datatype>();		
		
		
		Queue<String> persons = new LinkedList<String>();
		
		persons.add("adams");
		
		persons.add("joy");
		persons.add("ana");
		persons.offer("jack");
		
		System.out.println(persons);
		
		System.out.println(persons.remove());
		System.out.println(persons);
		System.out.println(persons.poll());
		System.out.println(persons);
		
		System.out.println(persons.peek());
		
		System.out.println(persons.element());
		
		
		//----------------------------------------------------------
		
		// Priority Queue 
		
//		  it will sort the queue based on priority.
//		  we will assign a priority values to each and every single item.
		
//		elements with high priority will serv before low priority elements.
		
		
//		------------------------------------------------------------------
		
//		DoubleEndedQueue - Deque
		
		
		
        Deque<Integer>  queue1 = new ArrayDeque<Integer>();
        
//          addFirst();
//          addLast();
//          removeFirst();
//          removeLast();
        
        
        
        // -----------------------------------------------------------
        
        
        Deque<Integer>  stack = new ArrayDeque<Integer>(); 
        
//		 stack by using Deque is much faster then normal stack DS
//       because normal stack DS is a synchronized as its extends from vector, 
//       thats why arrayDeque stack is fater than normal stack DS
        
        
		
	}

}
