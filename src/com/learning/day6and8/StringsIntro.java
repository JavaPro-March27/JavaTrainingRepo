package com.learning.day6and8;

public class StringsIntro {

	public static void main(String[] args) {
		
		
		// its a predefined non primitive datatype 
		// which is an object that represents sequence of char values.
		
		// java.lang.String
		
		// strings are immutable -> Once a string object is created, its values can not be chnaged.
        //  when you modify a string -> it will actually creats a new string.	
		
			
		
//		 String -> implements -> Serializable , Comparable, CharSequence.
		
//		String Class is Final in java.
		
//		Java Memory 
//		1. Heap Memory 
//		     -> Java Objects will be stored in heap, which is some portion of memory dedicated to storing objects and arrays.
//		     -> Heap memory is shared among all threads in JVM.
		
//	    2. Stack Memory 
//		     -> Java uses stack memory to store local variables and method call information.
//		     ->Each thread in JVM has its own stack, which is used for method calls and local variables.
		
		
		char[] chars = {'a','b','c','d'};
		String s = new String(chars);
		
		System.out.println(s);
		
//		Strings can be created in two ways.
//		1. String Literal -> "" -> stored inside a string  literal pool
//		2. new keyword.   -> new  -> stored inside a heap memory.
		
		
		
		String s1 =  "hello world";
		
		String s2 =  "hello world";
		
		String s3 =  "hello world";
		
		s1 = "hello";
		
		
		String s4 = new String("hello world");
		
		
		System.out.println(s2 == s3);
		
		System.out.println(s4 == s3); // shallow comparison
		
		System.out.println(s4.equals(s3)); // deep comparison
		
		
         s1 = "hello worl";
         s1=  "hello wo";
		
		 String s5  = "hello wo";
		 
//		       012345678910
		 s1 = "hello world";
		 
		 System.out.println(s1.length());
		
		 
		 System.out.println(s1.charAt(6));
		 
		 System.out.println(s1.indexOf('w'));
		 
		 System.out.println(s1.substring(4));
		 
		 System.out.println(s1.substring(1, 7));
		 
//		  concatenation, we use + operator
		 
		 System.out.println("hello " + "kim");
		 
		 System.out.println("hello " .concat("kim"));
		 
		 
//		  StringBuilder and StringBuffer  -> mutable
//		   -> this classes will allow you to modify strings without creating new objects each time.
//		   -> both classes will provide similar functionlity, but they differ in their thread safty.
		 
		 
		 
//		 Stringbuiler => its is not thread safe.
//		              -> which means its not suitable for multithreaded environments.
//		              -> however it is more efficient than StringBuffer.
		 
//		 StringBuffer => its is thread safe.
//         -> which means its suitable for multithreaded environments.
//         -> however it is less efficient than StringBuilder.
		 
		 StringBuilder sb = new StringBuilder();
		 
		 sb.append("hello");
		 sb.append(" ");
		 sb.append("world");
		 System.out.println(sb); // output is the type of StringBuilder
		 
		 String s6 = sb.toString();// output is the type of String
		 
		 
		 StringBuffer strBuf = new StringBuffer();
		 strBuf.append("hello");
		 strBuf.append(" ");
		 strBuf.append("world");
		 
		 strBuf.replace(0, 5, "my");
		 
		 System.out.println(strBuf);// output is the type of StringBuffer
		 
		 System.out.println(strBuf.toString()); //output is the type of String
		 
//		 Welcome to Store 
//		 
//		 a. add item to Inventory
//		 b. check Inventory
//		 if you select "a" option it will show these options 
//		 1. create laptop
//		 2. create table
//		 3. create light  
//		         if select option 1 , it will ask question to create a laptop        
//		         if select option 2, it will ask question to create a table
//		         if select option 3 , it will ask question to create a light
		 

	}

}
