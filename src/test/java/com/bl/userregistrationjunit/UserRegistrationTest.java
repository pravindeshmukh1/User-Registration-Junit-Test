package com.bl.userregistrationjunit;

import com.bl.UserRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //First Name Testcase
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
    //Last Name TestCase
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
    //Email Testcase
    @Test
    public void givenEmailAddress_withValidFormat_ShouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkEmailAddress("pravin1desh@gmail.com"));
    }
    //Mobile Number Testcase
    @Test
    public void givenMobileNumber_withCountryCode_FollowedBySpace_tenDigitNumber_ShouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkMobileNumber("91 9029152162"));
    }

    @Test
    public void givenMobileNumber_withOutCountryCode_tenDigitNumber_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkMobileNumber("9029152162"));
    }

    @Test
    public void givenMobileNumber_withCountryCode_notFollowedBySpace_tenDigitNumber_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkMobileNumber("919029152162"));
    }

    @Test
    public void givenMobileNumber_withCountryCode_FollowedBySpace_notExactTenDigitNumber_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkMobileNumber("91 90291521620"));
    }
    //Password TestCase
    @Test
    public void givenPassword__withAtLeastEightCharacter_shouldReturnTrue(){
        Assert.assertTrue(UserRegistration.checkPassword("admin@1234"));
    }
    @Test
    public void givenPassword__withAtLeastEightCharacter_shouldReturnFalse(){
        Assert.assertFalse(UserRegistration.checkPassword("admin"));
    }
    @Test
    public void givenPassword_withAtLeastOneUpperCase_shouldReturnTrue(){
        Assert.assertTrue(UserRegistration.checkPassword("Admin1234"));
    }
    @Test
    public void givenPassword_withoutUpperCase_shouldReturnFalse(){
        Assert.assertFalse(UserRegistration.checkPassword("admin1234"));
    }
    @Test
    public void givenPassword_withAtLeastEightCharacter_OneUpperCase_AtLeastOneNumericNumber_shouldReturnTrue(){
        Assert.assertTrue(UserRegistration.checkPassword("Admin123"));
    }
    @Test
    public void givenPassword_withAtLeastEightCharacter_OneUpperCase_withoutOneNumericNumber_shouldReturnFalse(){
        Assert.assertFalse(UserRegistration.checkPassword("Adminadmin"));
    }
    @Test
    public void givenPassword_withAtLeastEightCharacter_OneUpperCase_OneNumericNumber_withSpecialSymbol_shouldReturnTrue(){
        Assert.assertTrue(UserRegistration.checkPassword("Admin@1admin"));
    }
    @Test
    public void givenPassword_withAtLeastEightCharacter_OneUpperCase_OneNumericNumber_withOutSpecialSymbol_shouldReturnFalse(){
        Assert.assertFalse(UserRegistration.checkPassword("Admin1admin"));
    }
}
