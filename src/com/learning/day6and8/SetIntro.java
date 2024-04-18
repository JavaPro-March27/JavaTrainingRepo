package com.learning.day6and8;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetIntro {

	public static void main(String[] args) {
	
		
		//Set => All the ietms are unique => its interface
		// venn -diagrams 
		// => unions, intersection
		
//		     1. HashSet         => uses => 1D arrays
//		     2. LinkedHashset   => used => hashfunctions
//		     3. TreeSet         => uses => balanced binary Trees => Red black Trees
		
//		Set<Datatype>    name = new HashSet<Datatype>();
		
//		1. HashSet
//		hashset does not follow the insertion order
		Set<String> set1 = new HashSet<String>();
		set1.add("adams");
		set1.add("joe");
		set1.add("roy");
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<String>();
		set2.add("kim");
		set2.add("jack");
		set2.add("roy");
		
		System.out.println(set2);
		
		
		//set1.retainAll(set2);   // intersection of set1 and set2 and its stores it set1
		
		System.out.println(set1);
		
		set1.removeAll(set2);
		
		System.out.println(set1);  // remove intersection of set1 and set2 from set1 and its stores it set1
		
		// -------------------------------------------------------------------------
		
		// LinkedHashSet
		
		// LinkedHashSet maintains the insertion order
		
		// it needs more memory than hashset
		
		
		//---------------------------------------------------------------------------
		
		// 3. TreeSet -> Class -> sorted set is a interface 
		
//		  Balanced Binary Tree
		
//		  time complexity - O(log(n))
		
		
//		   SortedSet<Datatype> name = new TreeSet<Datatype>();
		
		
		  SortedSet<Integer> set3 = new TreeSet<Integer>();
		  
		  
		  set3.add(20);
		  set3.add(400);
		  set3.add(10);
		  set3.add(180);
		  set3.add(60);
		  set3.add(400);
		
		System.out.println(set3);
		
	     Set<Integer> subset = set3.subSet(10, 180);
	     
	     System.out.println(subset);
	     
	     System.out.println(set3.tailSet(60));
	     
	     System.out.println(set3.headSet(60));
	     
	     System.out.println(set3.first());
	     
	 	SortedSet<String> set4 = new TreeSet<String>();
		set4.add("joe");
		set4.add("adams");
		set4.add("roy");
		
		System.out.println(set4);
		
	}

}
