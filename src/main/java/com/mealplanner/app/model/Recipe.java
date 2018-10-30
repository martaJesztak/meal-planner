package com.mealplanner.app.model;

public class Recipe {

    private String id;
    private String title;
    private String image;
    private String source;
    private String url;
    private int yield;
    private String[] ingredients;
    private String instructions;
    private DietLabel[] dietlabels;
    private HealthLabel[] healthLabels;

    public Recipe(String id, String title, String image, String source, String url,
                  int yield, String[] ingredients, String instructions, DietLabel[] dietlabels,
                  HealthLabel[] healthLabels) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.source = source;
        this.url = url;
        this.yield = yield;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.dietlabels = dietlabels;
        this.healthLabels = healthLabels;
    }

    public Recipe() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
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
