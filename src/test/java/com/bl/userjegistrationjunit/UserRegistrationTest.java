package com.bl.userjegistrationjunit;

import com.bl.UserRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_withThreeOrMoreCharacter_and_firstCharacterCapital_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkFirstName("Pravin"));
    }

    @Test
    public void givenFirstName_withlessThenThreeCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("pr"));
    }

    @Test
    public void givenFirstName_withonlyLowerCaseCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("pravin"));
    }

    @Test
    public void givenFirstName_withThreeOrMoreCharacter_and_numberOrSpecialCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("Pravin1@"));
    }

    @Test
    public void givenLastName_withThreeOrMoreCharacter_and_firstCharacterCapital_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkLastName("Deshmukh"));
    }

    @Test
    public void givenLastName_withLessThenThreeCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkLastName("De"));
    }

    @Test
    public void givenLastName_withOnlyLowerCaseCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkLastName("deshmukh"));
    }

    @Test
    public void givenLastName_withThreeOrMoreCharacter_numberOrSpecialCharacter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkLastName("deshmukh@"));
    }

    @Test
    public void givenEmailAddress_withValidFormat_ShouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkEmailAddress("pravin1desh@gmail.com"));
    }
}
