package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatePasswordUC8Test {
    @Test
    public void givenPassword_WhenValid_ThenTrue() {
        boolean result = ValidatePasswordUC8.isPassword("Vishnu@499");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void Password_WhenValid_ThenFalse() {
        boolean result1 = ValidatePasswordUC8.isPassword("vishnu123");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}