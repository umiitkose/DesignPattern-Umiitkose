package com.umiitkose.behavioral.state.door.pattern2;

public abstract class AbstractDoor implements DoorState {
	protected boolean open;
	protected DoorStateManager dsm;

	public AbstractDoor(boolean open, DoorStateManager dsm) {
		this.open = open;
		this.dsm = dsm;
	}

	@Override
	public boolean isOpen() {
		return open;
	}

}
