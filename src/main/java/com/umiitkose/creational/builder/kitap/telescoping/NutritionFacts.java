package com.umiitkose.creational.builder.kitap.telescoping;

//Telescoping Pattern
public class NutritionFacts {
    //required
    private final int servingSize;
    private final int servings;
    //optional
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbonhydrate;


    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbonhydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbonhydrate = carbonhydrate;
    }



}
