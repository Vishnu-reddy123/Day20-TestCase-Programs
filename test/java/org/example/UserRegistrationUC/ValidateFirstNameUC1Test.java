package org.example.UserRegistrationUC;


import org.junit.Assert;
import org.junit.Test;



public class ValidateFirstNameUC1Test {
    @Test
    public void givenFirstName_WhenValid_ThenTrue() {
        boolean result = ValidateFirstNameUC1.isFirstNameInitialCapital("Vishnu");
        Assert.assertTrue(result);
        System.out.println(result);
    }
    @Test
    public void givenFirstName_WhenValid_ThenFalse() {
        boolean result1 = ValidateFirstNameUC1.isFirstNameInitialCapital("vishnu");
        Assert.assertFalse(result1);
        System.out.println(result1);

    }

}