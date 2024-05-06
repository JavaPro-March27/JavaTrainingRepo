package com.learning.advancedJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface SaySomething{
	public String say();
}


class Message{
	public Message(String message){
		System.out.println(message);
	}
}

interface Messageable{
	Message getMessage(String mesg);
}


public class Java8features {
     
	public static String staticMethodReference() {
		return "Hello, This is a static method" ;
	}
	
	public String instanceMethodReference() {
		return "Hello, This is a instance method";
	}
	public static void main(String[] args) {
	
//		Java 8 Enhancements
//		1. Lambda Expression
//		     -> helps us to write a code in functional style. 
//		     => way to implement SAM interface (Single Abstract Method) by using an expression.
//		      ()-> {
//		          body of lambda Expression
//          	}
		
		SaySomething s = ()->{
			return "hello world";
		};
		
		
		SaySomething mikeName = ()->{
			return "hello mike";
		};
		System.out.println(s.say());
		
		
		System.out.println(mikeName.say());
		
//		2. Method references 
//		   -> method reference is used to refer a method of functional Interface.  "::"
//		    1. Reference to a static method
               SaySomething obj = Java8features::staticMethodReference;
               System.out.println(obj.say());
               
//		    2. Reference to an instance method.
               Java8features j8f = new Java8features();
               SaySomething obj2 = j8f::instanceMethodReference;    
               System.out.println(obj2.say());
               
//		    3. Reference to a constructor.
               Messageable hello = Message::new;
               Message m1= hello.getMessage("this is my message");
		
//		3. Functional Interfaces
//		   ->  Functional Interface are nothing but Interface thats contrains one abstarct method.
//		4. Stream API
               
          List<String> mylist = Arrays.asList("Affenpinscher", "Affenpinscher","Afghan Hound", "Aidi", "Alano Español",
    				"Alaskan Klee Kai", "Alaskan Malamute", "Bullenbeisser", "Bullmastiff", "Bully Kutta", "Burgos Pointer",
    				"Cairn Terrier", "Canaan Dog", "Canadian Eskimo Dog", "Cane Corso", "Caucasian Shepherd Dog",
    				"Istrian Shorthaired Hound","Istrian Shorthaired Hound", "Italian Greyhound", "Jack Russell Terrier", "Jagdterrier", "Jämthund",
    				"Kai Ken", 	"Kai Ken",  "Kaikadi","Kaikadi", "Tweed Water Spaniel", "Tyrolean Hound", "Vizsla", "Volpino Italiano",
    				"Weimaraner", "Welsh Sheepdog", "Welsh Springer Spaniel", "Welsh Terrier");
          
//           -> java.util.stream
//           -> performs lazy computation. => it executes only when it requries.
//           -> functional-style operations.
          
          // to create a stream
          Stream<String> myStream = mylist.stream();
          
          // intermediate operations
          // Filter
          // Map
          // sorted 
          // distinct
               
          
          // Terminal Operations
          
          // forEach
          // collect
          // reduce
          // count
          // list animals that start with "A" and it make all Uppercase
              
          for(String word : mylist) {
        	  if(word.startsWith("A")) {
        		  System.out.println(word.toUpperCase());
        	  }
          }
          
          mylist.stream()
                .filter(word -> word.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(word -> System.out.println(word));

          
          // using refernece operator
          
          mylist.stream()
          .filter(word -> word.startsWith("A"))
          .map(word -> word.toUpperCase())
          .forEach( System.out::println);
          
         
          // collect
          List<String> animalsStartWithA = mylist.stream()
        		                                 .filter(word-> word.startsWith("A"))
        		                                 .map(String::toUpperCase)
        		                                 .collect(Collectors.toList());
        		  
          System.out.println(animalsStartWithA);
         
          // count
          long animalCount = mylist.stream()
                  .filter(word-> word.startsWith("B"))
                  .count();
          
          System.out.println(animalCount);
          
          
          
//		5. Default methods in interface
//           Methods which are defined inside a inerface are tagged with default keyword. 
          
//		6. Optional Class 
//           its public  and final class and is used to deal with NullPointerException in java
//            java.util
//             to check weather some value if present or not in particular variable.
          
          String[] strAry = new String[7];
          strAry[6] = "Hello Java";
//          String s6 = strAry[6].toLowerCase();
//          System.out.println(s6);
           Optional<String> optionalS6 =  Optional.ofNullable(strAry[6]);
           
           if(optionalS6.isPresent() ) {
        	  
        	  System.out.println(strAry[6].toLowerCase());
           }else {
        	   System.out.println("Element is not present");
           }
          
           
           Optional<String> optionalS5 =  Optional.of(strAry[5]);
           
 
          
 //		7. Collectors Class
//		8. IO, JDBC , Arrays, ForEach(), JavaScript Engine.
		
		
		
		
           
      //    int 123, 123456
           
      //    int  321,  654321

	}

}
