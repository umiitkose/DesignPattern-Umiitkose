package com.umiitkose.behavioral.strategy.designpattern.challenge;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
