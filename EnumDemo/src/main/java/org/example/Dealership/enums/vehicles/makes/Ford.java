package org.example.Dealership.enums.vehicles.makes;

import org.example.Dealership.enums.vehicles.Manufacturer;

public enum Ford  implements IMakes {
    F150("F-150"),
    F250("F-250"),
    F350("F-350"),
    FUSION("Fusion"),
    FOCUS("Focus"),
    ESCAPE("Escape"),
    EXPLORER("Explorer"),
    EXPEDITION("Expedition"),
    RANGER("Ranger"),
    BRONCO("Bronco"),
    MUSTANG("Mustang"),
    TRANSIT("Transit"),
    ECOSPORT("EcoSport"),
    EDGE("Edge"),
    MAVERICK("Maverick");

    private final String model;

    Ford(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getMake() {
        return Manufacturer.FORD;
    }

}
