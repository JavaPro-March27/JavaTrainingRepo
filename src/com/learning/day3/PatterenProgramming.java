package com.learning.day3;

public class PatterenProgramming {

	public static void main(String[] args) {
     
		
//		  12345678901 
//		      *
//		     * *
//		    * * *
//		   * * * * 
//        * * * * *
		
		
		int max =5;
		
		
		for( int i =0; i < 5; i++) {
			for( int j =0; j < max -i -1; j++) {
				System.out.print(" ");
			}
			for( int j =0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			

	}

}
