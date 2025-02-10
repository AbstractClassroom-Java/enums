package org.example.Dealership;

import org.example.Dealership.enums.Services;

import java.util.ArrayList;
import java.util.List;

public class ServiceCharge {
    private final Services service;
    private final double quantity;
    private final double cost;
    private final List<String> comments;

    public ServiceCharge(Services service, double quantity) {
        this.service = service;
        this.quantity = quantity;
        cost = service.getUnitPrice() * quantity;
        comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public Services getService() {
        return service;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public List<String> getComments() {
        return comments;
    }

    public String toString() {
        return service + " - Quantity: " + quantity + " - Cost: $" + String.format("%.2f", cost);
    }

}
