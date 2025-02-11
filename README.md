# Dealership Project

## Overview
This project is a Java-based application for managing a car dealership. It includes various classes and enums to handle customer details, vehicles, services, and invoices.

## Enums
Enums in Java help make code modular by providing a centralized way to define a set of named constants. This approach offers several benefits:

1. **Centralized Updates**: Enums allow you to define constants in one place. If you need to update or add new constants, you only need to do it in the enum definition. This reduces the risk of inconsistencies and errors that can occur when constants are scattered throughout the codebase.

2. **Consistency**: By using enums, you ensure that the same set of constants is used throughout the application. This reduces the likelihood of using different values for the same concept, which can lead to bugs and maintenance issues.

3. **Type Safety**: Enums provide type safety by ensuring that only valid constants are used. This prevents invalid values from being assigned, which can help catch errors at compile time rather than at runtime.

4. **Readability and Maintainability**: Enums make the code more readable and maintainable by providing meaningful names for constants. This makes the code easier to understand and reduces the cognitive load on developers.

5. **Modularity**: Enums encapsulate related constants within a single type, promoting modularity. This makes it easier to manage and understand the code, as related constants are grouped together logically.

Overall, enums help create a more maintainable, consistent, and modular codebase by centralizing the definition of constants and ensuring their consistent use throughout the application.



### `ErrorStrings`
This enum contains error messages used for validation throughout the application.

- `ZIP_CODE_FORMAT`: "Zip code must be in the format of 12345 or 12345-6789"
- `FIRST_NAME_BLANK`: "First name cannot be blank"
- `LAST_NAME_BLANK`: "Last name cannot be blank"
- `PHONE_NUMBER_FORMAT`: "Phone number must be in the format of 123-456-7890"
- `EMAIL_FORMAT`: "Email must be in a valid format"
- `ADDRESS_BLANK`: "Address cannot be blank"
- `CITY_BLANK`: "City cannot be blank"
- `STATE_NULL`: "State cannot be null"
- `NOTES_NULL`: "Notes cannot be null or blank"

### `States`
This enum represents the states in the United States.

### `Services`
This enum represents the different types of services offered by the dealership.

- `OIL_CHANGE`
- `TIRE_ROTATION`
- `BRAKE_REPAIR`
- `BODY_REPAIR`
- `INSPECTION`

### `Manufacturer`
This enum represents the different car manufacturers.

- `BMW`
- `FORD`
- `Chevy`

### Makes

For each of the manufacturers there is an enum that provides a list of models. 

