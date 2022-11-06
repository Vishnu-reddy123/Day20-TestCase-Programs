package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class ValidatePasswordUC8 {
    public static boolean isPassword(String password) {
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-[{}]:;',?/*~$^+=<>]).{8,20}$", password);
    }
}
