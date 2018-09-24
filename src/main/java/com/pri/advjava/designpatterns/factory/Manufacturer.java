package com.pri.advjava.designpatterns.factory;

	/*
	 * Step 5:
	 * 
	 * Client manufacturer
	 */

public class Manufacturer {

	public static void main(String[] args) {
		AluminiumBlockMold blockOutput = new AluminiumBlockMold();
		PowerOutput output10 = blockOutput.getPowerOutput(10);
		PowerOutput output12 = blockOutput.getPowerOutput(12);
		
		System.out.println("V10 engine capacity: "+output10);
		System.out.println("V12 engine capacity: "+output12);
	}
}
