package com.bridgelabz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class validateEmailsTest {
    static ValidateEmails validateEmails;

    @BeforeAll
    static void beforeAll() {
        validateEmails = new ValidateEmails();

    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailIsNull() {
        boolean result = validateEmails.validateEmails(null);
        assertFalse(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailHasProperPattern() {
        boolean result = validateEmails.validateEmails("abc.xyz@bl.co.in");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailIsWithoutSecondTld() {
        boolean result = validateEmails.validateEmails("abc.xyz@bl.co");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailHasDeshSignBeforeAtsign() {
        boolean result = validateEmails.validateEmails("abc-xyz@bl.co");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnTrue_whenEmailHasNumericCharactersBeforeAtsign() {
        boolean result = validateEmails.validateEmails("abc-100@bl.co");
        assertTrue(result);
    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailHasMissedATSIGN() {
        boolean result = validateEmails.validateEmails("abc.xyz.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailMissedPortionBeforeAtsign() {
        boolean result = validateEmails.validateEmails("@bl.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmails_shouldReturnFalse_whenEmailMissedPortion() {
        boolean result = validateEmails.validateEmails("@bl.com");
        assertFalse(result);
    }


}