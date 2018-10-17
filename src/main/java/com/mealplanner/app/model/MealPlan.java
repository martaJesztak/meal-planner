package com.mealplanner.app.model;

public class MealPlan {

    int id;

    int userId;

    int nrOfDays;

    DietLabel[] dietPreferences;

    public MealPlan() {}

    public MealPlan(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNrOfDays() {
        return nrOfDays;
    }

    public void setNrOfDays(int nrOfDays) {
        this.nrOfDays = nrOfDays;
    }

    public DietLabel[] getDietPreferences() {
        return dietPreferences;
    }

    public void setDietPreferences(DietLabel[] dietPreferences) {
        this.dietPreferences = dietPreferences;
    }
}
