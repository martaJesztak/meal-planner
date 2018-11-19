package com.mealplanner.app.model;

public enum  Mealtype {
    BREAKFAST ("breakfast"), LUNCH("lunch"), DINNER("dinner"),SNACK ("snack"), DRINK("drink");

    private final String displayName;

    Mealtype(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
