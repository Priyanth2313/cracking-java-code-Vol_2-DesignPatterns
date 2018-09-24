package com.pri.advjava.designpatterns.factory;

	/*
	 * Step 2
	 * 
	 * subclass creation polymorphic declaration
	 */

public class V12 implements PowerOutput {
	
	private AluminiumBlockMold valves;
	
	// constructor
	public V12(int valves) {
		this.valves = new AluminiumBlockMold();
	}

	// interface methods
	public int numberOfCylinders() {
		return 12;
	}

	public int hpGenerated() {
		return 700;
	}
	
	public String toString() {
		return "HP: "+this.hpGenerated()+", Cylinders: "+this.numberOfCylinders();
	}
	
	public AluminiumBlockMold getValves() {
		return this.valves;
	}
	
}
