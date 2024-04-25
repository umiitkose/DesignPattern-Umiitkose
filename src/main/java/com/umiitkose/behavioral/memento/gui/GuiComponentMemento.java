package com.umiitkose.behavioral.memento.gui;

public class GuiComponentMemento {
	
	private GuiComponentState state;
	
	public void setState(GuiComponentState state){
		this.state = state;
	}
	
	public GuiComponentState getState(){
		return state;
	}
}
