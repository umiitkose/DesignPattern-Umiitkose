package com.umiitkose.creational.builder.designpattern.pizza;

public class MeatPizzaBuilder extends PizzaBuilder {
	public MeatPizzaBuilder() {
		this.name = "Meat Lovers Pizza";
	}
	public PizzaBuilder addCheese() {
		// meat lovers like moz
		this.toppings.add("mozzerella");
		return this;
	}
	public PizzaBuilder addSauce() {
		this.toppings.add("NY style sauce");
		return this;
	}
	public PizzaBuilder addTomatoes() {
		this.toppings.add("sliced tomatoes");
		return this;
	}
	public PizzaBuilder addGarlic() {
		this.toppings.add("garlic");
		return this;
	}
	public PizzaBuilder addOlives() {
		// never add olives to meat lovers pizza
		return this;
	}
	public PizzaBuilder addSpinach() {
		// never add spinach to meat lovers pizza
		return this;
	}
	public PizzaBuilder addPepperoni() {
		this.toppings.add("pepperoni");
		return this;
	}
	public PizzaBuilder addSausage() {
		this.toppings.add("sausage");
		return this;
	}	
}