package com.learning.day3;

public class OOPS {

	public static void main(String[] args) {
		  
//		OOPS - > OBJECT ORIENTED PROGRAMMING
//		Main Componentes 
//		  -> Classes 
//		  -> Objects 
		
		
		
//		Classes => What is class ? 
//		Class is a template or blueprint for creating objects 
		
//		Class -> 1. Attributes 
//		      -> 2. Methods 
		
//		      1. Attributes => are decleared with in a class, variables with in a class 
//		      2. Methods  => are decleared with in a class,  these are used to perfrom certain actions. 
		
//		Class       => Object 
		
//		 Car        =>  volo, toyota, mazda 
		
//		 Human    => name, noOfLegs, noOfhands, eyes.....
//		          => sleeping(), eating(), walking()....
		
// -------------------------------------------------------------------------------------------------------	

		
//		 how to create a class ? 

		//		public class ClassName{
		
       //		     int x =10; -> attribute 
		
       //	        body of class 
		
      //	     }
		
		
// how  to create a method ?
		
//		accessModifier returntype   methodName(type variableName, .....){
//		  method body 
//		return ....
//	}
		
//  if you have void returntype then we dont need to add return keyword inside method
	
		
//		calling a method 
		
//		objectRef.methodName();
		
//		how can we create a object using class 
		
//		we will use a keyword called "new" to create a objects out of class

		
		
	}
	
	// simple method
	public void methodName() {
		// body of method
	}
	
	//returntype method
	public double methodName1() {
		
//		return doubleValue;
		
		return  2.34;
	}
	
	public void methodName2(int a, int b) {
		// body of method
	}
	
    public double methodName3(double a, double b) {
		
   //		return doubleValue;
		
		return  a+b;
	}
//----------------------------------------------------------------------------------
    
// task 1
    
//  Car  > has Attributes -> 	name, color, model, mfgYear, mileage
//       > has Methods    ->    drive(), stop()

//  Objects  -> volvo -> volvo, gray, v60, 2020, 30000 
//                      drive(), stop()
//           -> toyota -> camry, red, scl, 2024, 0 
//                        drive(), stop()

// ----------------------------------------------------------------------------------
// task 2
    
// House >  has Attributes - > type, address, norooms, age, owner , price  
//       >  has Methods -> rent(), sell(), buy(), remodel(), changePrice(updatedPrice)
    
// ----------------------------------------------------------------------------------    
//  task 3
    
//	Tv -> has Attributes -> type, model, os, size, mfgYear, specs, color, channelNo
//        has Methods -> 
//                -> changeChannel() =>  take a input channelNo to update, 
//                -> power(), operations(), volume()
//	              -> getType() => return type
//	              -> getOs() => return os
//	              -> getMfgYear()   => return mfgYear
//	              -> updateColor()  => take a input color to update
//	              -> updateModel()  => take a input model to update
   
    
    
    
    
}
