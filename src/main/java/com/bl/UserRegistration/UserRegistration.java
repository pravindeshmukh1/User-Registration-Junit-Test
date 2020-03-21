package com.bl.UserRegistration;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public static boolean checkFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }
}
