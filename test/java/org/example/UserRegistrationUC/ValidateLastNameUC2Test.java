package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateLastNameUC2Test {
    @Test
    public void givenLastName_WhenValid_ThenTrue() {
        boolean result = ValidateLastNameUC2.isLastNameInitialCapital("Reddy");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenInValid_ThenFalse() {
        boolean result1 = ValidateLastNameUC2.isLastNameInitialCapital("reddy");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}