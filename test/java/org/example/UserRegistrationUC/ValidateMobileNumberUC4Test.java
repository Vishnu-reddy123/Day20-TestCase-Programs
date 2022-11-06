package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateMobileNumberUC4Test {
    @Test
    public void givenMobileNumber_WhenValid_ThenTrue() {
        boolean result = ValidateMobileNumberUC4.isMobileNumber("+91 9919819801");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ThenFalse() {
        boolean result1 = ValidateMobileNumberUC4.isMobileNumber("7013310736");
        Assert.assertFalse(result1);
        System.out.println(result1);

    }
}