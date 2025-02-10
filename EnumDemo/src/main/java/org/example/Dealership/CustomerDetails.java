package org.example.Dealership;

import org.example.Dealership.enums.ErrorStrings;
import org.example.Dealership.enums.States;

import java.util.ArrayList;
import java.util.List;

public record CustomerDetails(
        String firstName,
        String lastName,
        String phoneNumber,
        String email,
        String address,
        String city,
        States state,
        String zipCode,
        List<String> notes
    )
{

    public CustomerDetails {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException(ErrorStrings.FIRST_NAME_BLANK.toString());
        }

        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException(ErrorStrings.LAST_NAME_BLANK.toString());
        }

        validatePhoneNumber(phoneNumber);
        validateEmail(email);
        validateZipCode(zipCode);

        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException(ErrorStrings.ADDRESS_BLANK.toString());
        }

        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException(ErrorStrings.CITY_BLANK.toString());
        }

        if (state == null) {
            throw new IllegalArgumentException(ErrorStrings.STATE_NULL.toString());
        }
        notes = new ArrayList<>();

    }

    public void addNotes(String note) {
        if (note == null || note.isBlank()) {
            throw new IllegalArgumentException(ErrorStrings.NOTES_NULL.toString());
        }
        notes.add(note);
    }

    private void validatePhoneNumber(String phoneNumber) {
        //regex to validate phone number
        String phoneRegex = "^(\\d{3})-(\\d{3})-(\\d{4})$";
        if (!phoneNumber.matches(phoneRegex)) {
            throw new IllegalArgumentException(ErrorStrings.PHONE_NUMBER_FORMAT.toString());
        }
    }
    private void validateEmail(String email) {
        //regex to validate email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (!email.matches(emailRegex)) {
            throw new IllegalArgumentException(ErrorStrings.EMAIL_FORMAT.toString());
        }
    }

    private void validateZipCode(String zipCode) {
        //regex to validate zip code
        String zipCodeRegex = "^\\d{5}(?:[-\\s]\\d{4})?$";
        if (!zipCode.matches(zipCodeRegex)) {
            throw new IllegalArgumentException(ErrorStrings.ZIP_CODE_FORMAT.toString());
        }
    }

    private String formatCustomerNotes(int tabLevel) {
        StringBuilder sb = new StringBuilder();
        for (String note : notes) {
            sb.append("\t".repeat(tabLevel+1))
                    .append(note)
                    .append("\n");
        }
        return sb.toString();
    }

    public String toString() {
        return toString(0);
    }
    public String toString(int tabLevel) {
        List<String> tabbedComponents = new ArrayList<>();
        tabbedComponents.add("First Name: " + firstName);
        tabbedComponents.add("Last Name: " + lastName);
        tabbedComponents.add("Phone Number: " + phoneNumber);
        tabbedComponents.add("Email: " + email);
        tabbedComponents.add("Address: " + address);
        tabbedComponents.add("City: " + city);
        tabbedComponents.add("State: " + state);
        tabbedComponents.add("Zip Code: " + zipCode);



        StringBuilder sb = new StringBuilder()
                .append("\t".repeat(tabLevel+1))
                .append("Customer Details: \n");
        for (String component : tabbedComponents) {
            sb.append("\t".repeat(tabLevel+2))
                    .append(component)
                    .append("\n");
        }
        sb.append("\t".repeat(tabLevel+1));
        sb.append("Customer Notes: \n");
        sb.append(formatCustomerNotes(tabLevel+1));
        return sb.toString();
    }
}


