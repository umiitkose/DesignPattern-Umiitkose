package com.umiitkose.creational.builder.kitap.javabeans;

//JavaBeans Pattern
public class NutritionFacts {
    //required
    private int servingSize;
    private int servings;
    //optional
    private int calories;
    private int fat;
    private int sodium;
    private int carbonhydrate;

    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbonhydrate(int carbonhydrate) {
        this.carbonhydrate = carbonhydrate;
    }
}
