package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    /**
     * Main method is starting point os this program.
     *
     * @param args
     */
    public static void main(String[] args) {
        String firstName = "Dhiraj";
        String lastName = "Sharma";
        String email = "abc.xyz@bl.co.in";
        String mNumber = "91 8988373573";
        String password = "A3@gfkdhs";
        System.out.println(validateName(firstName));
        System.out.println(validateName(lastName));
        System.out.println(validateEmail(email));
        System.out.println(validatingMobile(mNumber));
        System.out.println(validatePassword(password));
    }

    /**
     * Method for validating the user first and last  name using regex.
     *
     * @param name : user input as first or last name
     * @return : true or false
     */
    private static boolean validateName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        if (name == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }


    /**
     * Method for validating the user's email using regex
     *
     * @param email : user's email
     * @return : true or false
     */
    private static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$");
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Method for validating the user's mobile number using regex
     *
     * @param mNumber : User's mobile number
     * @return : true or false
     */
    private static boolean validatingMobile(String mNumber) {
        Pattern pattern = Pattern.compile("^[9][1]+\\s\\d{10}$");
        if (mNumber == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(mNumber);
        return matcher.matches();
    }

    /**
     * Method for validating the user's password using regex.
     * Rule1 – minimum 8 characters
     * Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
     * Rule3 – Should have at least 1 numeric number in the password
     * Rule4 – Has exactly 1 Special Character
     *
     * @param password : user password
     * @return : true or false.
     */
    private static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[#?!@$%^&*-])(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-Z]){8,}$");
        if (password == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}