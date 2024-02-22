package com.umiitkose.creational.builder.kitap.javabeans;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setServingSize(12);
        nutritionFacts.setServings(12);
        nutritionFacts.setSodium(12);
        nutritionFacts.setFat(1);
        nutritionFacts.setCalories(4);
        nutritionFacts.setCarbonhydrate(2);
    }
}
