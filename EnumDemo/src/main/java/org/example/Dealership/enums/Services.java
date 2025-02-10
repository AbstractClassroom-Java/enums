package org.example.Dealership.enums;

public enum Services {
    OIL_CHANGE("Oil Change", PricingUnit.FLAT_RATE, 50.29),
    TIRE_ROTATION("Tire Rotation", PricingUnit.FLAT_RATE, 23.99),
    ALIGNMENT("Alignment", PricingUnit.FLAT_RATE, 79.99),
    BRAKE_REPAIR("Brake Repair", PricingUnit.PER_HOUR, 89.99),
    BATTERY_REPLACEMENT("Battery Replacement", PricingUnit.FLAT_RATE, 129.99),
    INSPECTION("Inspection", PricingUnit.FLAT_RATE, 15.99),
    SUSPENSION_REPAIR("Suspension Repair", PricingUnit.PER_HOUR, 99.99),
    BODY_REPAIR("Body Repair", PricingUnit.PER_HOUR, 120.99);

    private final String name;
    private final PricingUnit pricingUnit;
    private final double unitPrice;

    Services(String name, PricingUnit pricingUnit, double unitPrice) {
        this.name = name;
        this.pricingUnit = pricingUnit;
        this.unitPrice = unitPrice;
    }

    public String getServiceName() {
        return name;
    }

    public PricingUnit getPricingUnit() {
        return pricingUnit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String toString(int tabLevel) {
        return "\t".repeat(tabLevel) + toString();
    }

    public String toString() {
        return name + " (" + pricingUnit + "): $" + unitPrice;
    }
}
