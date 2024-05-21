package com.umiitkose.behavioral.observer.designpattern.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
