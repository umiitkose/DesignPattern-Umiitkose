package com.umiitkose.structural.decorator.designpattern.pizza;

public abstract class Pizza {
	String description = "Basic Pizza";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
