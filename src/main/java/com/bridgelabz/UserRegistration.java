package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    /**
     * Main method is starting point os this program.
     *
     * @param args
     */
    public static void main(String[] args) throws ValidationException {
        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();

        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println(userRegistration.ValidationChecker.validate(RegexEnum.name.getRegex(), firstName));

        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println(userRegistration.ValidationChecker.validate(RegexEnum.name.getRegex(), lastName));

        System.out.print("Enter Email : ");
        String email = scanner.next();
        System.out.println(userRegistration.ValidationChecker.validate(RegexEnum.email.getRegex(), email));

        System.out.print("Enter Phone Number : ");
        String pNumber = scanner.next();
        System.out.println(userRegistration.ValidationChecker.validate(RegexEnum.phone.getRegex(), pNumber));

        System.out.print("Enter Password : ");
        String password = scanner.next();
        System.out.println(userRegistration.ValidationChecker.validate(RegexEnum.password.getRegex(), password));
    }


    /**
     * Method for validating the user's first name, last name, email, password, and phone number using regex.
     * For password :
     * Rule1 – minimum 8 characters
     * Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
     * Rule3 – Should have at least 1 numeric number in the password
     * Rule4 – Has exactly 1 Special Character
     *
     * @param regex : regular expression
     * @param data : first name, last name, email, password, and phone number
     * @return
     * @throws ValidationException
     */
    private boolean validator(String regex, String data) throws ValidationException {
        try {
            Pattern pattern = Pattern.compile(regex);
            if (data == null) {
                return false;
            }
            Matcher matcher = pattern.matcher(data);
            if (matcher.matches())
                return true;
            else
                throw new ValidationException("Invalid " + data);
        } catch (ValidationException e) {
            throw new ValidationException(e.getMessage());
        }
    }

    /**
     * lambda function implication
     */
    public IValidateChecker ValidationChecker = (regex, data) -> {
        try {
            return validator(regex, data);
        } catch (ValidationException e) {
            throw new ValidationException(e.getMessage());
        }
    };
}