package com.umiitkose.creational.abstractfactory.gui.sol1;

public class ListFactory implements GUIFactory {

	@Override
	public List create() {
		return new List();
	}

}
