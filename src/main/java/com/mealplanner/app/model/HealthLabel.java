package com.mealplanner.app.model;

public enum HealthLabel {
    VEGAN("vegan"), VEGETERIAN("vegetarian"), PALEO("paleo"), DAIRYFREE("dairy-free"), GLUTENFREE("gluten-free"), WHEETFREE("wheet-free"), FATFREE("fat-free"), LOWSUGAR("low-suger"), EGGFREE("egg-free"), PEANUTFREE("peanut-free"), TREENUTFREE("treenut-free"), SOYFREE("soy-free"), FISHFREE("fish-free"), SHELLFISHFREE("shellfish-free");

    public final String label;

    HealthLabel(String label) {
        this.label = label;
    }
}
