package org.example.UserRegistrationUC;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateUserDetailsUC10Test {
    @Test
    public void givenUserDetaiils_WhenValid_ThenHappy() {
        Assert.assertTrue(ValidateUserDetailsUC10.isFirstNameInitialCapital("Vishnu"));
        Assert.assertTrue(ValidateUserDetailsUC10.isLastNameInitialCapital("Reddy"));
        Assert.assertTrue(ValidateUserDetailsUC10.isEmailValidate("vishnu95532@gmail.com"));
        Assert.assertTrue(ValidateUserDetailsUC10.isMobileNumberValidate("91 9919819801"));
        Assert.assertTrue(ValidateUserDetailsUC10.isPasswordHaveSpecialChar("Vishnu@123"));
        Assert.assertTrue(ValidateUserDetailsUC10.isCombineAllMails("abc-100@yahoo.com"));
    }

    @Test
    public void givenUserDetaiils_WhenInValid_ThenSad() {
        Assert.assertFalse(ValidateUserDetailsUC10.isFirstNameInitialCapital("vishnu"));
        Assert.assertFalse(ValidateUserDetailsUC10.isLastNameInitialCapital("reddy"));
        Assert.assertFalse(ValidateUserDetailsUC10.isEmailValidate("Vishnugmail.com"));
        Assert.assertFalse(ValidateUserDetailsUC10.isMobileNumberValidate("7013310736"));
        Assert.assertFalse(ValidateUserDetailsUC10.isPasswordHaveSpecialChar("vishnu@921"));
        Assert.assertFalse(ValidateUserDetailsUC10.isCombineAllMails("Vishnu"));



    }
}