package com.mealplanner.app.model;

public enum Day {

    MONDAY ("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat"), SUNDAY("Sun");

    public final String label;

    Day(String label) {
        this.label = label;
    };

    public String getDisplayName() {
        return label;
    }

}
