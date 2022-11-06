package org.example.UserRegistrationUC;
import java.util.regex.Pattern;
public class ValidateEmailUC3 {
    public static boolean isEmailInitialCapital(String email) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
    }
}
