package com.umiitkose.creational.abstractfactory.gui.sol1;

public class ButtonFactory implements GUIFactory {
	
	public Button create() {
		return new Button();
	}
}
