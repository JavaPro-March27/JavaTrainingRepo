package com.learning.java.designPatterns;

public class Demo {

	public static void main(String[] args) {
	   ProductBuilder builder = new ProductBuilder();
	   
	    Product any = builder.withName("dell")
	    		           .withSize(11)
	    		           .withType("electronic")
	    		           .build();
	    
	    System.out.println(any);
	    
	    
	    Product appleMini = builder.withCatagory("phone")
	    		       .withName("apple")
	    		       .withType("mini")
	    		       .withNoOfSims(1)
	    		       .withHeight(6.1)
	    		       .withSize(2)
	    		       .build();
	    
	    
	    System.out.println(appleMini);
	    
	    Product macAir = builder.withCatagory("laptop")
	    		       .withName("mac")
	    		       .withType("air")
	    		       .withSize(14)
	    		       .withRam("4GB")
	    		       .withProcesser("M2")
	    		       .build();
	    System.out.println(macAir);

	}

}
