package com.umiitkose.behavioral.chain_of_responsibility.callCenter;

public class StandardCustomer extends AbstractCustomer{

	@Override
	public void askAQuestion() {
		askAStandardQuestion();
	}
	
	private void askAStandardQuestion() {
		System.out.println("\nStandard Customer: Asking a question!");
	}
}
