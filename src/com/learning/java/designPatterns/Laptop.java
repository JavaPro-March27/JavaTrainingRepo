package com.learning.java.designPatterns;

public class Laptop extends Product {
      private String ram;
      private String processer;
	 
	public Laptop(String name, String type, int size, String ram, String processer) {
		super(name, type, size);
		this.ram= ram;
		this.processer = processer;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcesser() {
		return processer;
	}

	public void setProcesser(String processer) {
		this.processer = processer;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", processer=" + processer + ", name=" + name + ", type=" + type + ", size="
				+ size + "]";
	}


	
	

}
