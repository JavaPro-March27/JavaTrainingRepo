package com.learning.java.designPatterns;

public class Phone extends Product{
	
	  
	double height;
	   int noOfSims;
	   
	   public Phone(String name, String type, int size, double height, int noOfSims) {
			super(name, type, size);
			this.height = height;
			this.noOfSims = noOfSims;
		}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getNoOfSims() {
		return noOfSims;
	}

	public void setNoOfSims(int noOfSims) {
		this.noOfSims = noOfSims;
	}

	@Override
	public String toString() {
		return "Phone [height=" + height + ", noOfSims=" + noOfSims + ", name=" + name + ", type=" + type + ", size="
				+ size + "]";
	}

	

}
