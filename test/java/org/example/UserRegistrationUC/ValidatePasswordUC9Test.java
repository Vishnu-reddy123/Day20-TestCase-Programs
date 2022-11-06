package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatePasswordUC9Test {
    @Test
    public void givenPassword_WhenValid_ThenTrue() {
        boolean result = ValidatePasswordUC9.isPassword("abc@yahoo.com,");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void Password_WhenValid_ThenFalse() {
        boolean result1 = ValidatePasswordUC9.isPassword("vishnu123gmail.com");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}