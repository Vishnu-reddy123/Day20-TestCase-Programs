package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateEmailUC3Test {
    @Test
    public void givenEmail_WhenValid_ThenTrue() {
        boolean result = ValidateEmailUC3.isEmailInitialCapital("vishnu95532@gmail.com");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenEmail_WhenValid_ThenFalse() {
        boolean result1 = ValidateEmailUC3.isEmailInitialCapital("huhjkjco.in");
        Assert.assertFalse(result1);
        System.out.println(result1);

    }
}