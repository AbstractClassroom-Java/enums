package org.example.Dealership.enums;

public enum PricingUnit {
    FLAT_RATE("Flat Rate"),
    PER_HOUR("Per Hour");

    private final String name;

    PricingUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(int tabLevel) {
        return "\t".repeat(tabLevel) + toString();
    }

    public String toString() {
        return name;
    }
}
