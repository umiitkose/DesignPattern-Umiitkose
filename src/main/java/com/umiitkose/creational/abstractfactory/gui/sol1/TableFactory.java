package com.umiitkose.creational.abstractfactory.gui.sol1;

public class TableFactory implements GUIFactory {

	@Override
	public Table create() {
		return new Table();
	}
}
