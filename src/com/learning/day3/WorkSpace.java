package com.learning.day3;

public class WorkSpace {

	public static void main(String[] args) {
//		             objectName
//		ClassName    variableName      new    ClassName();
		Human        person1         = new  Human();
		Human        person2         = new  Human();
		Human        person3         = new  Human();
		Human        person4         = new  Human();
		
		person1.name = "roy";
		person1.noOfeyes = 2;
		person1.noOfhands =2;
		person1.noOfLegs =2;
		
		System.out.println(person1.name);
		
		person2.name = "kim";
		person2.noOfeyes = 2;
		person2.noOfhands =2;
		person2.noOfLegs =2;
		
		
		person3.name = "joy";
		person3.noOfeyes = 2;
		person3.noOfhands =2;
		person3.noOfLegs =2;
		
		person4.name = "Jack";
		
		
		System.out.println(person2.name);
		
		person1.sleeping();
         
		person2.eating();
		
		person3.walking();
		
	//  Objects  -> volvo -> volvo, gray, v60, 2020, 30000 
//      drive(), stop()
//               -> toyota -> camry, red, scl, 2024, 0 
//                            drive(), stop()	
		
		System.out.println("--------------------------------------");
		Car volvo = new Car();
		volvo.name = "volvo";
	    volvo.color = "gray";
	    volvo.model ="v60";
	    volvo.mfgYear= 2020;
	    volvo.mileage = 30000;
	    volvo.drive();
	    volvo.stop();
	    
	    System.out.println(Car.noOfWheels);
	    Car.noOfWheels = 5;
	    System.out.println(Car.noOfWheels);
	    
		System.out.println("--------------------------------------");
	    
	    House myhouse = new House();
	    myhouse.norooms =4;
	    myhouse.type ="apt";
	    myhouse.age = 10;
	    myhouse.owner = "xyz";
	    myhouse.price = 100000;
	    
	    myhouse.rent();
	    myhouse.sell();
	    myhouse.remodel();
	    System.out.println(myhouse.price);
	    myhouse.changePrice(150000);
		
	    System.out.println(myhouse.price);
	    
		System.out.println("--------------------------------------");
		
		
		Tv ledTv = new Tv();
		ledTv.type = "LED";
		ledTv.channelNo= 35;
		ledTv.color = "red";
		ledTv.mfgYear= 2024;
		ledTv.model = "smart";
		ledTv.os = "OS 21";
		ledTv.specs ="wifi, hdmi";
		ledTv.size =55.00;
		
		
		ledTv.changeChannel(40);
		
		
		ledTv.updateColor("white");
		
		ledTv.updateModel("OLED");
		
		String type = "empty";
		
		System.out.println(type);
		
		type = ledTv.getType();
		
		
		System.out.println(type);
		
	    
		System.out.println("--------------------------------------");
		
		
		
		
		
		
		
	}

}
