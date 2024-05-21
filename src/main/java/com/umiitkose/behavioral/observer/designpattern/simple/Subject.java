package com.umiitkose.behavioral.observer.designpattern.simple;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
