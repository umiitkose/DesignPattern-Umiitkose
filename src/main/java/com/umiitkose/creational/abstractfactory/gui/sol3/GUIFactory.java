package com.umiitkose.creational.abstractfactory.gui.sol3;

interface GUIFactory {
	
    public Component createButton();
    
    public Component createList();
    
    public Component createTable();
}
