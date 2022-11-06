package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class ValidateUserDetailsUC10 {
    public static boolean isFirstNameInitialCapital(String firstName) {
        return Pattern.matches("[A-Z][a-z]{2,}", firstName);
    }

    public static boolean isLastNameInitialCapital(String lastName) {
        return Pattern.matches("[A-Z][a-z]{2,}", lastName);
    }

    public static boolean isEmailValidate(String email) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
    }

    public static boolean isMobileNumberValidate(String mobileNumber) {
        return Pattern.matches("[91]{2}[ ][0-9]{10}", mobileNumber);
    }

    public static boolean isPasswordHaveSpecialChar(String password) {
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-[{}]:;',?/*~$^+=<>]).{8,20}$", password);
    }

    public static boolean isCombineAllMails(String mailID) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+$", mailID);
    }
}
