package com.learning.day5;

public class ObjectClassIntro {

	public static void main(String[] args) {
		
//		 its a root/parent class for all the objects that are created inside a java.
		Object o = new Object();
	
//		  - toString();
//		      -> it will return the String representation of Objects.
//		  - equals(Object obj);
//		      -> it will used ti indicate whether some other object is equal or not to current object.
//		      -> by default it will check weather both belongs to same memoery location or not.
//		  - hashCode();
//		      -> it will return the hash code values of obejct.
//		  - getClass();
//		      -> it provides the infromation about the class.
//		  - clone();
//		      -> it will create the new copy of the object and retruns it.
//		  - finalize();
//		      ->it will be called by garbage collector on an object when garbage collector determines 
//		         that there are no more references to that object.
		
		
	    //  Product   -> id, name , price, rating  - > Abstract class 
        //		             -> checkTotalSales() - > this is a normal method
        //----------------------------------------------------------------		
		//   Laptop  -- > screenSize, RAM, SSD, processer
        //		             -> checkCharging,   checkLogin
		
		//----------------------------------------- phase 2
        //		             -> constructor
        //		             -> Override the default toString to print the Object 
        //		                 with id, name , price,  screenSize, RAM, SSD, processer
		
		//----------------------------------------- phase 3
        //                     -> Override the default equals to compare two Objects 
        //		                 comparession condition    id, ram, ssd, processer needs to be same to be equal 	
		//----------------------------------------------------------------			
		//   Table   -- >    height, width, length
        //		             -> area method, volumn method
		
		//-----------------------------------------phase 2
        //                   -> constructor
		//		             -> Override the default toString to print the Object 
        //		                 with id, name , price,  height, width, length
		
		//----------------------------------------- phase 3
        //                     -> Override the default equals to compare two Objects 
        //		                 comparession condition    id, length, height, width needs to be same to be equal 
		//----------------------------------------------------------------			
		//    Light  ->  wats, lumens 
        //                   -> noOfAmps,  checkPowerUTil
		
		//-----------------------------------------phase 2
        //                   -> constructor
        //                   -> Override the default toString to print the Object 
        //		                 with id, name , price,  wats, lumens 
		
		//----------------------------------------- phase 3
        //                     -> Override the default equals to compare two Objects 
        //		                 comparession condition    id, wats, lumens  needs to be same to be equal 
		
		// create getters and setters -Product, Laptop,Table, Light
		
		// min 2 obejct of each.
		
		
		
		
		

	}

}
