package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class ValidatePasswordUC7 {
    public static boolean isPassword(String password) {
        return Pattern.matches("[A-Z][a-z]{5,}[0-9]{1,}", password);
    }
}