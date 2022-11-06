package org.example.UserRegistrationUC;
import java.util.regex.Pattern;
public class ValidateMobileNumberUC4 {
    public static boolean isMobileNumber(String mobileNumber) {
        return Pattern.matches("^\\+(?:[0-9] ?){6,14}[0-9]$", mobileNumber);

    }
}
