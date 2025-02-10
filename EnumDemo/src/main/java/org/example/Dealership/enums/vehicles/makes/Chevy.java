package org.example.Dealership.enums.vehicles.makes;

import org.example.Dealership.enums.vehicles.Manufacturer;

public enum Chevy implements IMakes {
    SILVERADO("Silverado"),
    TAHOE("Tahoe"),
    CAMARO("Camaro"),
    CORVETTE("Corvette"),
    TRAVERSE("Traverse"),
    EQUINOX("Equinox"),
    TRAX("Trax"),
    BLAZER("Blazer"),
    MALIBU("Malibu"),
    IMPALA("Impala"),
    SPARK("Spark"),
    SONIC("Sonic"),
    BOLT("Bolt"),
    VOLT("Volt"),
    COLORADO("Colorado"),
    EXPRESS("Express"),
    TRAILBLAZER("Trailblazer"),
    SUBURBAN("Suburban");

    private final String model;

    Chevy(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getMake() {
        return Manufacturer.CHEVY;
    }

}
