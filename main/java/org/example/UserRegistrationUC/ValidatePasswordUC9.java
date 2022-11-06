package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class ValidatePasswordUC9 {
    public static boolean isPassword(String password) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+$", password);
    }
}
