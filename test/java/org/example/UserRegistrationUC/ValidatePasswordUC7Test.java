package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatePasswordUC7Test {
    @Test
    public void givenPassword_WhenValid_ThenTrue() {
        boolean result = ValidatePasswordUC7.isPassword("Vishnuva12");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void Password_WhenValid_ThenFalse() {
        boolean result1 = ValidatePasswordUC7.isPassword("vishnuqwe");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}