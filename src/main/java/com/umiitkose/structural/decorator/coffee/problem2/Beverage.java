package com.umiitkose.structural.decorator.coffee.problem2;

public class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;
    private double milkCost = 0.5;
    private double mochaCost = 0.3;
    private double soyCost = 0.4;
    private double whipCost = 0.2;

    public String getDescription() {
        return description;
    }

    double cost() {
        double cost = 0;
        if (isMilk())
            cost += milkCost;
        if (isMocha())
            cost += mochaCost;
        if (isSoy())
            cost += soyCost;
        if (isWhip())
            cost += whipCost;
        return cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
