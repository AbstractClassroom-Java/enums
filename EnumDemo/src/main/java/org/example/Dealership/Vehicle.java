package org.example.Dealership;

import org.example.Dealership.enums.vehicles.makes.IMakes;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    IMakes model;
    int year;
    int mileage;
    String vin;

    public Vehicle(IMakes model, int year, int mileage, String vin) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.vin = vin;
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int tabLevel) {
        List<String> tabbedComponents = new ArrayList<>();
        tabbedComponents.add("Make: " + model.getMake());
        tabbedComponents.add("Model: " + model.getModel());
        tabbedComponents.add("Year: " + year);
        tabbedComponents.add("Mileage: " + mileage);
        tabbedComponents.add("VIN: " + vin);

        StringBuilder sb = new StringBuilder()
                .append("\t".repeat(tabLevel))
                .append("Vehicle Details: \n");
        for (String component : tabbedComponents) {
            sb.append("\t".repeat(tabLevel+1))
                .append(component)
                .append("\n");
        }
        return sb.toString();
    }
}
