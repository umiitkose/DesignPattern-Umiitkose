package com.umiitkose.creational.builder.kitap.builder;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(5, 3)
                .fat(1).build();
    }
}
