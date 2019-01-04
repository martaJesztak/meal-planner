package com.mealplanner.app.model;

import java.util.Map;

public class MealPlan {

    private String id;
    private int userId;
    private DietLabel[] dietPreferences;
    private Recipe[] recipes;
    private int numberOfDays;
    private Map<Day,Recipe> mealPLan;

    public MealPlan() {}

    public MealPlan(String id, int userId, DietLabel[] dietPreferences, Recipe[] recipes, int numberOfDays, Map<Day, Recipe> mealPLan) {
        this.id = id;
        this.userId = userId;
        this.dietPreferences = dietPreferences;
        this.recipes = recipes;
        this.mealPLan = mealPLan;
    }

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public DietLabel[] getDietPreferences() {
        return dietPreferences;
    }

    public void setDietPreferences(DietLabel[] dietPreferences) {
        this.dietPreferences = dietPreferences;
    }

    public Recipe[] getRecipes() {
        return recipes;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setRecipes(Recipe[] recipes) {
        this.recipes = recipes;
    }


}