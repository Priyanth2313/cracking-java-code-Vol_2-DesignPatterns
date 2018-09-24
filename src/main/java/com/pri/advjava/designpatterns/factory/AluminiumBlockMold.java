package com.pri.advjava.designpatterns.factory;

	/*
	 * Step 4:
	 * 
	 * Factory class: Engine block factory class
	 */

public class AluminiumBlockMold {

	public PowerOutput getPowerOutput(int valves) {
		if (valves == 12) {
			return new V12(valves);				
		} else if(valves == 10) {
			return new V10(valves);
		}
		return null;
	}
}
