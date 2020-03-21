package com.bl.userjegistrationjunit;

import com.bl.UserRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFirstName_withThreeOrMoreCharacter_and_firstCharacterCapital_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkFirstName("Pravin"));
    }

    @Test
    public void whenGivenFirstName_lessThenThreeCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("pr"));
    }

    @Test
    public void whenGivenFirstName_onlyLowerCaseCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("pravin"));
    }

    @Test
    public void whenGivenFirstName_withThreeOrMoreCharacter_and_numberOrSpecialCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("Pravin1@"));
    }

}
