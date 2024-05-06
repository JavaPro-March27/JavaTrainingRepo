package com.learning.java.designPatterns;

public class Product {
	
	protected String name;
	protected String type;
	protected int size;
	
	public Product(String name, String type, int size) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", size=" + size + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	

}
