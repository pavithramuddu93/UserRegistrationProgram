package com.userprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

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

    private static boolean validateName(String name){
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        if (name == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }


    private static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$");
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean validatingMobile(String mNumber){
        Pattern pattern = Pattern.compile("^[9][1]+\\s\\d{10}$");
        if (mNumber == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(mNumber);
        return matcher.matches();
    }

    private static boolean validatePassword(String password){
        Pattern pattern = Pattern.compile("^(?=.*[#?!@$%^&*-])(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-Z]){8,}$");
        if (password == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}