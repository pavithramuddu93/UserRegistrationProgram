package com.userprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

       public static void main(String[] args) {
        String firstName = "Dhiraj";
        String lastName = "Sharma";
        System.out.println(validateFirstName(firstName));
        System.out.println(validateLastName(lastName));
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
}