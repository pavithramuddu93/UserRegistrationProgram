package com.userprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        String firstName = "Dhiraj";
        String lastName = "Sharma";
        String email = "abc.xyz@bl.co.in";
        System.out.println(validateFirstName(firstName));
        System.out.println(validateLastName(lastName));
        System.out.println(validateEmail(email));
    }

    private static boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    private static boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    private static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}