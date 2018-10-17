package com.mealplanner.app.model;

public enum DietLabel {
    BALANCED ("balanced"), HIGHPROTEIN("high-protein"),
    HIGHFIBER("high-fiber"), LOWFAT("low-fat"), LOWCARB("low-carb"),
    LOWSODIUM("low-sodium");

    public final String label;

    DietLabel (String label) {
        this.label = label;
    }
}
