package com.learning.day6and8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterableIntro {

	public static void main(String[] args) {
		
//		 Iterable is a parent for all the collections
//		  it is sued to read data from all the collection implemention classes.
//		  we can read and remove the data using Iterator.
		
//		  hasNext();
//		  next();
//		  remove();
		
		 ArrayList<String> names = new ArrayList<String>();
		  names.add("roy");
		  names.add("joy");
		  names.add("jack");
		  names.add("kim");
		
		  Iterator<String> itr = names.iterator();
		  
		  System.out.println(itr.hasNext());   // it will check weather it has a next item or not
		  System.out.println("---------");
		  System.out.println(itr.next());  // it will value of next item.
		  
		  System.out.println("---------");
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		
		  
          HashMap<String, Integer>  personsAgeMap = new HashMap<String, Integer>();
		   
		   personsAgeMap.put("ana", 21);
		   
		   personsAgeMap.put("joy", 32);

		   personsAgeMap.put("roy", 55);
		   
		   
		   Iterator<String> itr2 = personsAgeMap.keySet().iterator();
		   
		   System.out.println("---------");
		   while(itr2.hasNext()) {
			   System.out.println(personsAgeMap.get(itr2.next()));
		   }
		   System.out.println("---------");
		   
		   Iterator<Map.Entry<String, Integer>> itr3 = personsAgeMap.entrySet().iterator();
		   
		   while(itr3.hasNext()) {
			   System.out.println(itr3.next());
		   }
			   
		

	}

}
