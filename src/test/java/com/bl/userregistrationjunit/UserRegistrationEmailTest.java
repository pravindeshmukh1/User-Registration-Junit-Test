package com.bl.userregistrationjunit;

import com.bl.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationEmailTest {
    private String emailId;
    private boolean expectResult;

    public UserRegistrationEmailTest(String emailId, boolean expectResult) {
        this.emailId = emailId;
        this.expectResult = expectResult;
    }

    @Parameterized.Parameters
    public static Collection emails() {
        return Arrays.asList(new Object[][]{
                {
                        "abc@yahoo.com", true
                },
                {
                        "abc-100@yahoo.com", true
                },
                {
                        "abc.100@yahoo.com", true
                },
                {
                        "abc111@abc.com", true
                },
                {
                        "abc-100@abc.net", true
                },
                {
                        "abc.100@abc.com.au", true
                },
                {
                        "abc@1.com", true
                },
                {
                        "abc@gmail.com.com", true
                },
                {
                        "abc+100@gmail.com", true
                },
                {
                        "abc-gmail.com", false
                },
                {
                        "abc@.com.my", false
                },
                {
                        "abc123@gmail.a", false
                },
                {
                        "abc123@.com", false
                },
                {
                        "abc123@.com.com", false
                },
                {
                        ".abc@abc.com", false
                },
                {
                        "abc()*@gmail.com", false
                },
                {
                        "abc@%*.com", false
                },
                {
                        "abc..2002@gmail.com", false
                },
                {
                        "abc.@gmail.com", false
                },
                {
                        "abc@abc@gmail.com", false
                },
                {
                        "abc@gmail.com.1a", false
                },
                {
                        "abc@gmail.com.aa.au", false
                }
        });
    }

    @Test
    public void givenEmailId_shouldReturn_validOrNot() {
        boolean result = UserRegistration.checkEmailAddress(emailId);
        Assert.assertEquals(result, expectResult);
    }
}
