package org.example.Dealership.enums.vehicles.makes;

import org.example.Dealership.Vehicle;
import org.example.Dealership.enums.vehicles.Manufacturer;

public enum BMW implements IMakes {
    X1("X1"),
    X3("X3"),
    X5("X5"),
    X7("X7"),
    M3("M3"),
    M4("M4"),
    M5("M5"),
    M8("M8");

    private final String model;

    BMW(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getMake() {
        return Manufacturer.BMW;
    }
}
