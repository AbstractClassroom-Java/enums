package org.example.Dealership.enums;

public enum ErrorStrings {
    FIRST_NAME_BLANK("First name cannot be blank"),
    LAST_NAME_BLANK("Last name cannot be blank"),
    PHONE_NUMBER_BLANK("Phone number cannot be blank"),
    EMAIL_BLANK("Email cannot be blank"),
    ADDRESS_BLANK("Address cannot be blank"),
    CITY_BLANK("City cannot be blank"),
    STATE_NULL("State cannot be null"),
    ZIP_CODE_BLANK("Zip code cannot be blank"),
    VEHICLE_NULL("Vehicle cannot be null"),
    NOTES_NULL("Notes cannot be null"),

    PHONE_NUMBER_FORMAT("Phone number must be in the format of 123-456-7890"),
    EMAIL_FORMAT("Email must be in the format of example@domain.com"),
    ZIP_CODE_FORMAT("Zip code must be in the format of 12345 or 12345-6789");

    private final String errorString;

    ErrorStrings(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {
        return errorString;
    }

    public String toString() {
        return "Error: " + errorString;
    }
}
