package com.learning.day6and8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIntro {

	public static void main(String[] args) {
		
		
//		Map => key and value pairs  => pair is known as Entry
		
//		 1. HashMap 
//		 2. Linked Hash Map 
//		 3. Tree Map
		
		
//       => aim of Ds => O(1)
		
		
//  		arrays      >   Binary Trees             >        Balanced Binary Tree      > Hash Functions
//		      O(n)           O(log(n)) -> not 100%                 O(log(n))            >    O(1)
		
//		 we want all the operations to be O(1)
		
//		Hash Function => it defines the relation between keys and memory Index.
		
		
//		 a=1, n =2, = b=3, c=4, r=5, o=6 , y=11
		


 
//  Collisions  => inserting multiple key values into single memory location.
		
		
//		                                 avg case                     worst case 
//		   search                          O(N)                          O(N)
//		   insertion                       O(1)                          O(N)
//		   deletion                        O(1)                          O(N)
		
		
//		   HashMap<KeyDatatype , valueDatatype>   name  = new   HashMap<KeyDatatype , valueDatatype>();
		
		   HashMap<String, Integer>  personsAgeMap = new HashMap<String, Integer>();
		   
		   personsAgeMap.put("ana", 21);
		   
		   personsAgeMap.put("joy", 32);

		   personsAgeMap.put("roy", 55);
 
		   personsAgeMap.put(null, 26);
		   personsAgeMap.put(null, 32);
		   personsAgeMap.put("roy", 65);
		   
		   System.out.println(personsAgeMap);
		   
		   System.out.println(personsAgeMap.get("roy"));
		   
		   
		   
		   for(Map.Entry<String, Integer> entry : personsAgeMap.entrySet()) {
			   System.out.println(entry.getKey());
			   System.out.println(entry.getValue());
			   System.out.println(entry);
		   }
		   
		   
		   
		   
		   // HashMap does not follow the insertion order
		   // HashMap will accept null as key.
		   
		   //----------------------------------------------------------------------------
        
		   
//		    LinkedHashMap 
//		    uses double Linked List
//		    needs more memory 
//		    LinkedHashMap will accept null as key.
//		    LinkedHashMap follow the insertion order	
//		    LinkedHashMap<KeyDatatype , valueDatatype>   name  = new   LinkedHashMap<KeyDatatype , valueDatatype>();

		   
//		   ---------------------------------------------------------------------------------------
		   
//		    Treemap -> Class => SortedMap -> interface -=>time complexity => O(log(n))
		   
//		    => Balanced binary Trees => Avl Trees a or Red black Trees 
		   
//		       TreeMap<KeyDatatype , valueDatatype>   name  = new   TreeMap<KeyDatatype , valueDatatype>()
		   
		   
		    TreeMap<Double, String> prices = new TreeMap<Double, String>();
		    
		    prices.put(525.32, "dell");
		    prices.put(112.12, "hp");
		    prices.put(56.25, "mac");
		    prices.put(125.62, "asus");
		    
		    System.out.println(prices);
		    
		    System.out.println(prices.firstKey());
		    System.out.println(prices.lastKey());
		    
		    
//                        hashMap                                   LinkedHashMap                                TreeMap
			
//                        uses Arrays                               doubleLinkedList                       Balanced binary tree                 

//best case             can achive O(1)                              can achive O(1)                         O(log(n))   => 100%
 
//worst case	            O(log(n))                                    O(log(n))                               O(log(n)) 

//                  we can store null as keys                      we can store null as keys              we can not store null as keys 

//                  does not follow insertion order               does follow insertion order               does follow sorting order 

		   
	}

}
