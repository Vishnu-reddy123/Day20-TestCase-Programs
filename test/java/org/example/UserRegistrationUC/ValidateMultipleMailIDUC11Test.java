package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateMultipleMailIDUC11Test {
    @Test
    public void givenEmailID_WhenValid_ThenTrue() {
        Assert.assertTrue(ValidateMultipleMailIDUC11.validateForMultipleMailID("abc100@yahoo.com,"));
        Assert.assertTrue(ValidateMultipleMailIDUC11.validateForMultipleMailID("xyz@gmail.com,"));
        Assert.assertTrue(ValidateMultipleMailIDUC11.validateForMultipleMailID("100-@xyz.com,"));
        Assert.assertTrue(ValidateMultipleMailIDUC11.validateForMultipleMailID("56abc@abc.com,"));
        Assert.assertTrue(ValidateMultipleMailIDUC11.validateForMultipleMailID("lmn@yahoo.com.in"));
    }

    @Test
    public void givenEmailID_WhenInvalid_ThenFalse() {
        Assert.assertFalse(ValidateMultipleMailIDUC11.validateForMultipleMailID("abc-100yahoo.com,"));
        Assert.assertFalse(ValidateMultipleMailIDUC11.validateForMultipleMailID("xyzgmail.com"));
        Assert.assertFalse(ValidateMultipleMailIDUC11.validateForMultipleMailID("100-xyz.com,@"));
        Assert.assertFalse(ValidateMultipleMailIDUC11.validateForMultipleMailID("56abcabc.com,"));
        Assert.assertFalse(ValidateMultipleMailIDUC11.validateForMultipleMailID("lmnyahoo.com.in"));
    }
}

