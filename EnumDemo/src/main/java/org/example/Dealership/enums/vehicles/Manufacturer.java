package org.example.Dealership.enums.vehicles;

public enum Manufacturer {
    BMW("BMW"),
    FORD("Ford"),
    CHEVY("Chevy");

    private final String make;

    Manufacturer(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public String toString(int tabLevel) {
        return "\t".repeat(tabLevel) + toString();
    }

    public String toString() {
        return make;
    }
}
