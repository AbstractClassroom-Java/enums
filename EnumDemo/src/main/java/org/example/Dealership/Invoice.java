package org.example.Dealership;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private final Vehicle vehicle;
    private final CustomerDetails customerDetails;
    private final List<ServiceCharge> services;
    private double totalCost;
    private final List<String> comments;



    public Invoice(Vehicle vehicle, CustomerDetails customerDetails) {
        this.vehicle = vehicle;
        this.customerDetails = customerDetails;
        this.services = new ArrayList<>();
        this.totalCost = 0;
        this.comments = new ArrayList<>();
    }

    public void addService(ServiceCharge service) {
        services.add(service);
        totalCost += service.getCost();
        for (String comment : service.getComments()) {
            comments.add(comment);
        }
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice Details: \n")
                .append(customerDetails.toString(1))
                .append("\n")
                .append(vehicle.toString(2))
                .append("\n")
                .append("Services: \n");
        for (ServiceCharge service : services) {
            sb.append("\t").append(service).append("\n");
        }
        sb.append("Total Cost: $")
                //format total cost to 2 decimal places
                .append(String.format("%.2f", totalCost))
                .append("\n")
                .append("Comments: \n");
        for (String comment : comments) {
            sb.append("\t")
                    .append(comment)
                    .append("\n");
        }
        return sb.toString();
    }


}
