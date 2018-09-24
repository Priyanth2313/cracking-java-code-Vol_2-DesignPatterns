package com.pri.advjava.designpatterns.factory;

	/*
	 * Step 3:
	 * 
	 * create another subclass creation polymorphic declaration
	 *
	 */

public class V10 implements PowerOutput {
private AluminiumBlockMold valves;
	
	// constructor
	public V10(int valves) {
		this.valves = new AluminiumBlockMold();
	}

	// interface methods
	public int numberOfCylinders() {
		return 10;
	}

	public int hpGenerated() {
		return 500;
	}
	
	public String toString() {
		return "HP: "+this.hpGenerated()+", Cylinders: "+this.numberOfCylinders();
	}
	
	public AluminiumBlockMold getValves() {
		return this.valves;
	}
}
