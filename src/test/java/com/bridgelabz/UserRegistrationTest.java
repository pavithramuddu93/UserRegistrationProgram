package com.bridgelabz;

import junit.framework.Assert;
import junit.framework.TestCase;

public class UserRegistrationTest extends TestCase {

    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.firstName("Kiran");
        Assert.assertEquals(true,result);
    }

    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.lastName("Hulawale");
        Assert.assertEquals(true,result);
    }

    public void givenMail_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.validMail("abc-100@yahoo.com");
        Assert.assertEquals(true,result);
    }

    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.validMobile("91 9657104407");
        Assert.assertEquals(true,result);
    }

    public void givenRuleOne_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.ruleOne("abcdefgh");
        Assert.assertEquals(true,result);
    }

    public void givenRuleTwo_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.ruleTwo("aBcdefgh");
        Assert.assertEquals(true,result);
    }

    public void givenRuleThree_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.ruleThird("Abcd1efg");
        Assert.assertEquals(true,result);
    }

    public void givenRuleForth_WhenProper_ShouldReturnTrue() {
        UserRegistration userDetails=new UserRegistration();
        boolean result=userDetails.ruleFourth("P@ssw0rd");
        Assert.assertEquals(true,result);
    }
}