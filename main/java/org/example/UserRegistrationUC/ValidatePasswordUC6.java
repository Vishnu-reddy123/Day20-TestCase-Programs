package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class ValidatePasswordUC6 {
    public static boolean isPassword(String password) {
        return Pattern.matches("[A-Z][a-z]{7}", password);
    }
}
