package com.bl.UserRegistration;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public static boolean checkFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }

    public static boolean checkLastName(String lastName) {
        return lastName.matches(LAST_NAME_PATTERN);
    }
}
