package com.umiitkose.behavioral.chain_of_responsibility.callCenter;

public abstract class AbstractCustomer implements Customer{

	@Override
	public void receiveAnswer(String answer){
		System.out.println("Answer: " + answer);
	}
}
