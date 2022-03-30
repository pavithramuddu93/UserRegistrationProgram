package com.userprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        String firstName = "Dhiraj";
        String lastName = "Sharma";
        String email = "abc.xyz@bl.co.in";
        String mNumber = "91 8988373573";
        System.out.println(validateFirstName(firstName));
        System.out.println(validateLastName(lastName));
        System.out.println(validateEmail(email));
        System.out.println(validatingMobile(mNumber));
    }

    private static boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    private static boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    private static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean validatingMobile(String mNumber){
        Pattern pattern = Pattern.compile("^[9][1]+\\s\\d{10}$");
        Matcher matcher = pattern.matcher(mNumber);
        return matcher.matches();
    }
}