package com.mealplanner.app.model;

public class Recipe {

    int id;
    String title;
    String[] ingredients;
    String instructions;
    DietLabel[] dietlabels;
    HealthLabel[] healthLabels;

    public Recipe(int id, String title, String[] ingredients, String instructions, DietLabel[] dietlabels, HealthLabel[] healthLabels) {
        this.id = id;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.dietlabels = dietlabels;
        this.healthLabels = healthLabels;
    }

    public Recipe() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public DietLabel[] getDietlabels() {
        return dietlabels;
    }

    public void setDietlabels(DietLabel[] dietlabels) {
        this.dietlabels = dietlabels;
    }

    public HealthLabel[] getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(HealthLabel[] healthLabels) {
        this.healthLabels = healthLabels;
    }
}
