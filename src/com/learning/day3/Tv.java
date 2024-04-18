package com.learning.day3;

public class Tv {
	
//	Tv -> has Attributes -> type, model, os, size, mfgYear, specs, color, channelNo
//  has Methods -> 
//          -> changeChannel() =>  take a input channelNo to update, 
//          -> power(), operations(), volume()
//            -> getType() => return type
//            -> getOs() => return os
//            -> getMfgYear()   => return mfgYear
//            -> updateColor()  => take a input color to update
//            -> updateModel()  => take a input model to update
	String type;
	String model;
	String os; 
	double size;
	int mfgYear;
	String specs;
	String color;
	int channelNo;
	
	
	public void changeChannel(int inputChannelNo) {
		channelNo = inputChannelNo;
		System.out.println("updated Channel: "+ channelNo);
	}
    
	public String getType() {
		
		return type;
	}
	
	public int mfgYear() {
		return mfgYear;
	}
	
	public String getOs() {
		return os;
	}
	
	public void updateColor(String inputColor) {
		color = inputColor;
		System.out.println("updated Color: "+ color);
	}
//	-> updateModel()  => take a input model to update
	
	public void updateModel(String inputModel) {
		model = inputModel;
		System.out.println("updated model: "+ model);
	}

}
