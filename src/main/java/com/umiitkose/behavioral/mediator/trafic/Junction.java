
package com.umiitkose.behavioral.mediator.trafic;

public class Junction {
	private String name;
	private boolean busy;

	public Junction(String name) {
		this.name = name;
		busy = false;
		System.out.println("Junction " + name + " created.");
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public String getName() {
		return name;
	}
}
