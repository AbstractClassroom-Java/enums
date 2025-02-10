package org.example;

import org.example.Dealership.CustomerDetails;
import org.example.Dealership.Invoice;
import org.example.Dealership.ServiceCharge;
import org.example.Dealership.Vehicle;
import org.example.Dealership.enums.Services;
import org.example.Dealership.enums.States;
import org.example.Dealership.enums.vehicles.makes.BMW;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(BMW.X1, 2021, 23874, "AABB12D8DW");

        CustomerDetails c1 = new CustomerDetails(
                "John",
                "Doe",
                "123-456-7890",
                "hey@example.com",
                "1234 Main St",
                "Louisville",
                States.KENTUCKY,
                "40202",
                null);
        c1.addNotes("Customer claims car is making a weird noise when turning left.");
        c1.addNotes("Customer is interested in trading in their current vehicle.");
        c1.addNotes("Customer is looking to purchase a new vehicle within the next 3 months.");
        c1.addNotes("Customer refuses to purchase a vehicle with a sunroof.");
        c1.addNotes("Customer thinks Jimmy is the worst mechanic in the world.");
        c1.addNotes("Customer appears to like James as a mechanic.");

        ServiceCharge oilChange = new ServiceCharge(Services.OIL_CHANGE, 1);
        oilChange.addComment("Oil pan drain plug had to be replaced due to cross threading. (Jimmy strikes again)");
        ServiceCharge tireRotation = new ServiceCharge(Services.TIRE_ROTATION, 1);
        tireRotation.addComment("Customer requested to have tires rotated due to uneven wear.");
        ServiceCharge brakeRepair = new ServiceCharge(Services.BRAKE_REPAIR, 1.25);
        brakeRepair.addComment("Customer requested brake pads to be replaced due to squeaking. They appeared to be in good shape but we want his money.");
        ServiceCharge bodyRepair = new ServiceCharge(Services.BODY_REPAIR, 2.5);
        bodyRepair.addComment("Customer requested body work to be done on the rear bumper due to a minor accident.");
        ServiceCharge inspection = new ServiceCharge(Services.INSPECTION, 1);
        inspection.addComment("Customer requested a full inspection of the vehicle to ensure it is in good condition.");


        Invoice invoice1 = new Invoice(v1, c1);
        invoice1.addService(oilChange);
        invoice1.addService(tireRotation);
        invoice1.addService(brakeRepair);
        invoice1.addService(bodyRepair);
        invoice1.addService(inspection);
        invoice1.addComment("Customer was very satisfied with the service provided.");
        invoice1.addComment("Customer indicated Jimmy should be fired.");
        System.out.println(invoice1);



    }
}