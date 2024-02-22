package com.umiitkose.creational.abstractfactory.gui.sol2;

public class GUIFactoryImpl implements GUIFactory {
    public Button createButton() {
        return new Button();
    }

	@Override
	public List createList() {
		return new List();
	}

	@Override
	public Table createTable() {
		return new Table();
	}
}
