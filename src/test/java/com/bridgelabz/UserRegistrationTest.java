package com.bridgelabz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {

    static UserRegistration userRegistration;

    @BeforeAll
    static void beforeAll() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void validateName_shouldReturnTrue_whenFirstLatterIsCapital() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.name.getRegex(), "Dhiraj");
        assertTrue(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameFirstLatterIsSmall() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.name.getRegex(), "dhiraj");
        assertFalse(result);
    }

    @Test
    public void validateName_shouldReturnTrue_whenNameStartsWithCapAndHasMini3Characters() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.name.getRegex(), "Dhi");
        assertTrue(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameStartsWithCapAndHasLessThan3Characters() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.name.getRegex(), "Dh");
        assertFalse(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameIsNull() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.name.getRegex(), null);
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnFalse_whenEmailIsNull() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.email.getRegex(), null);
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnFalse_whenEmailMissAnyOfMandatoryParts() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.email.getRegex(), "@bl.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnFalse_whenEmailMissATSIGN() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.email.getRegex(), "abc.xyz.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnTrue_whenEmailHasAllMandatoryParts() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.email.getRegex(), "abc.xyz@bl.co.in");
        assertTrue(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenMobileNumbersAreNull() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.phone.getRegex(), null);
        assertFalse(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenCountryCodeIsMissing() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.phone.getRegex(), "8988373573");
        assertFalse(result);
    }

    @Test
    public void validateMobile_shouldReturnTrue_whenCountryCodeIsMentioned() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.phone.getRegex(), "91 8988373573");
        assertTrue(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenCountryCodeIsMentionedWithoutSpace() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.phone.getRegex(), "918988373573");
        assertFalse(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenNumbersIsLessInCount() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.phone.getRegex(), "91 89883");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordIsNull() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.password.getRegex(), null);
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnTrue_whenPasswordProper() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.password.getRegex(), "Ah5f@djs");
        assertTrue(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordMissUpperCaseCharacter() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.password.getRegex(), "as2@cfr");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordMissNumericCharacter() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.password.getRegex(), "Ah@jscfr");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordIsLessThan8Characters() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.password.getRegex(), "Ah@js");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordMissSpecialCharacter() throws ValidationException {
        boolean result = userRegistration.ValidationChecker.validate(RegexEnum.password.getRegex(), "Ah5fkdjs");
        assertFalse(result);
    }

}





