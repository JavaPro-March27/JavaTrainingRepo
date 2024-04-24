package com.learning.advancedJava8;

public class GCExampleClass {
	
	
	@Override
	protected void finalize() throws Throwable {
	     System.out.println(" This Object is collected by Garbage Collector");
	}

}
