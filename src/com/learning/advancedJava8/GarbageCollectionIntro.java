package com.learning.advancedJava8;

public class GarbageCollectionIntro {
	
	public static void main(String[] args) {
		
//		GarbageCollection => This is implemented by manu langugaes, including java, 
//		                     automatically manages the memory by reclaming memory occupied by objects that are no longer in use.
		
		GCExampleClass gc1 = new GCExampleClass();
		
		GCExampleClass gc2 = new GCExampleClass();
		
		gc1 = null;
		gc2 = null;
		
		
		gc1 = new GCExampleClass();
		
		String a = "hello";
	     a= "dxfcgvhbjnk";
	     
		
		for(int i = 20; i <22; i++) {
			System.out.println(i+"hello");
		}
		
		System.gc();
		
		
//		Garbage collection Strategies:
//		1. Serial Garbage collector
//		    -> suitable for single threaded application. use signle thread for garbage collection
//		2. Parallel Garbage collector
//		    ->suitable for Multi threaded application.  use Multiple threads for garbage collection
//		3. Concurrent Mark Sweep(CMS) collector
//		    -> Minimizes application pause times by running most of Gc work concurrently with aplication threads.
//		4. G1 Garbage Collector. 
//		    -> Designed to provide more predicatable pause times by dividing the head memory into 
//		       special regions and performing gc in these regions.
			
		
	}

}
