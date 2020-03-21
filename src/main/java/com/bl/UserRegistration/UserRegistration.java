package com.bl.UserRegistration;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_ID_PATTERN = "^([a-zA-Z0-9]{1,}[._+-]?[0-9a-zA-Z]{1,})[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,3}){1,2}$";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{2,3}[ ][0-9]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[#$^+!*()@%&]).{8,}$";

    public static boolean checkFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }

    public static boolean checkLastName(String lastName) { return lastName.matches(LAST_NAME_PATTERN); }

    public static boolean checkEmailAddress(String emailID) {
        return emailID.matches(EMAIL_ID_PATTERN);
    }

    public static boolean checkMobileNumber(String mobileNumber) {
        return mobileNumber.matches(MOBILE_NUMBER_PATTERN);
    }

    public static boolean checkPassword(String password) { return password.matches(PASSWORD); }

}
