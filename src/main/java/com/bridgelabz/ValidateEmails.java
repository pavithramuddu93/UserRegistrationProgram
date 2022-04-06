package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmails {

    /**
     * Method to ensure all the sample emails are valid, using regex.
     *
     * @param regex : regular expression
     * @param email : sample emails
     * @return : True or False
     */
    private boolean validateEmails(String regex, String email) throws ValidationException {

        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            throw new ValidationException("invalid Email");

    }


    public IValidateChecker emailValidator = (regex, email) -> {
        try {
            return validateEmails(regex, email);
        } catch (ValidationException e) {
            throw new ValidationException(e.getMessage());
        }
    };


    public static void main(String[] args) throws ValidationException {
        Scanner scanner = new Scanner(System.in);
        ValidateEmails validateEmails = new ValidateEmails();
        System.out.print("Enter Email : ");
        String useInput = scanner.next();

        System.out.println(validateEmails.emailValidator.validate(RegexEnum.email.getRegex(), useInput));

    }
}