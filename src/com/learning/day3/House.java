package com.learning.day3;

public class House {
	
	// House >  has Attributes - > type, address, norooms, age, owner , price  
//           >  has Methods -> rent(), sell(), buy(), remodel(), changePrice(updatedPrice)
	String type;
	String address;
	int norooms;
	int age;
	String owner;
	double price;
	

	
	public void rent() {
		System.out.println("rent");
	}
	
	public void sell() {
		System.out.println("sell");
	}
	
	public void buy() {
		System.out.println("buy");
	}
	
	public void remodel() {
		System.out.println("remodel");
	}
	public void changePrice(double updatedPrice) {
		price = updatedPrice;
		System.out.println("updated price " + price);
	}

}
