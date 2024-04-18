package com.learning.day5;

public class Table {
	
	int length; 
	int height;
	int width;
	
	
    
	public boolean equals(Table obj) {
		
		return obj.length == this.length && obj.height ==this.height && obj.width == this.width ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Length : " + this.length + "height : "+ this.height + "Width : "+ this.width;
	}
	


}
