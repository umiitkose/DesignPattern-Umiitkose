package com.umiitkose.behavioral.state.door.pattern2;

public class ClosedDoor extends AbstractDoor {

	public ClosedDoor(DoorStateManager dsm) {
		super(false, dsm);
	}

	@Override
	public void open() {
		dsm.openDoor();
	}

	@Override
	public void close() {
		System.out.println("Door is already closed.");
	}
}
