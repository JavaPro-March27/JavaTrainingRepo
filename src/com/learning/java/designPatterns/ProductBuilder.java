package com.learning.java.designPatterns;

public class ProductBuilder {
	
	private String name;
	private String type;
	private int size;
    private String ram;
    private String processer;
    private double height;
    private int noOfSims;
	
	private String catagory="";
	
	public ProductBuilder withName(String name) {
		this.name = name;
		return this;
	}


	public ProductBuilder withType(String type) {
		this.type= type;
		
		return this;
	}


	public ProductBuilder withSize(int size) {
		this.size = size;
		return this;
	}
	
	public ProductBuilder withCatagory(String catagory) {
		this.catagory = catagory;
		return this;
	}

	
	public ProductBuilder withRam(String ram) {
		this.ram = ram;
		return this;
	}
	
	public ProductBuilder withProcesser(String processer) {
		this.processer = processer;
		return this;
	}
	
	public ProductBuilder withHeight(double height) {
		this.height = height;
		return this;
	}
	
	public ProductBuilder withNoOfSims(int noOfSims) {
		this.noOfSims = noOfSims;
		return this;
	}
	
	
	public Product build() {
		Product p = null;
		
		
		if(catagory.equalsIgnoreCase("laptop")) {
			p = new Laptop(name, type, size, ram, processer);
		}else if(catagory.equalsIgnoreCase("phone")) {
			p = new Phone(name, type, size, height, noOfSims);
		}else {
			p = new Product(name, type, size);
		}
		
		
		return p;
	}

}
