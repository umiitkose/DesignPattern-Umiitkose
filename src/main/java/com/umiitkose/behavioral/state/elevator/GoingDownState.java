package com.umiitkose.behavioral.state.elevator;

public class GoingDownState implements ElevatorState {

	public void goDown() {
		System.out.println(":)");
	}

	public void goUp() {
		System.out.println("Please first stop the elevator.");
	}

	public void openDoor() {
		System.out.println("Please first stop the elevator.");
	}

	public void stop() {
		System.out.println("Stooping!");
	}
}
 