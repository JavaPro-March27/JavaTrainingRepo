package com.learning.day4;

public class ArraysIntro {
	
	public static void main(String[] args) {
		
		// arrays size is fixed.
		// same datatype can only be stored.
		// it will give you certain methods to certain actions.
		
		
//		dataType[]   arrayVariableName = new datatype[sizeOFArray];
		int[]         xyz              = new int[10];
		
		xyz[0] = 100;
		xyz[2] = 450;
		
		
		
		
//	  dataType[] 	arrayVariableName = {....values };
		int[]          abc            = {10,20,30,40,50,60,70,80,90,100};
		
		
		
		
		
		for( int index =0; index < abc.length; index++) {
			System.out.println("index "+ index);
			System.out.println(abc[index]);
		}
		
		
		// create a array  of 10 people names and print it.
		
		
		
		
		
		
	}

}
