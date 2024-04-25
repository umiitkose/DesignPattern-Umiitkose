
package com.umiitkose.behavioral.mediator.trafic;

public interface TrafficMediator {
	
	public void receive(Vehicle vehicle);
	
	public void askPermitToPass(Vehicle vehicle);

	public void done(Vehicle vehicle);

}
