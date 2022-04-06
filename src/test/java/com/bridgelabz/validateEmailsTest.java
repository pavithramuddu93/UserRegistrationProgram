package com.bridgelabz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class validateEmailsTest {
    ValidateEmails validateEmails;

    @BeforeAll
    public void setup() {
        validateEmails = new ValidateEmails();
    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailIsNull() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), null);
        assertFalse(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailHasProperPattern() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), "abc.xyz@bl.co.in");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailIsWithoutSecondTld() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), "abc.xyz@bl.co");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailHasDeshSignBeforeAtsign() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), "abc-xyz@bl.co");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailHasNumericCharactersBeforeAtsign() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), "abc-100@bl.co");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailHasMissedATSIGN() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), "abc.xyz.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailMissedPortionBeforeAtsign() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), "@bl.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailMissedPortion() throws ValidationException {
        boolean result = validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), "@bl.com");
        assertFalse(result);
    }


}