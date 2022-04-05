package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmails {

    /**
     * Method to ensure all the sample emails are valid, using regex.
     * @param email : sample emails
     * @return
     */
    private static boolean validateEmails(String email){
        String regex = "^[a-z]{2,}[0-9a-z]+(?=.*[_.-])(?=.*[a-z0-9])[@]+[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validateEmails("abc@yahoo.com"));
    }
}
