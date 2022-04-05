package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        return pattern.matcher(name).matches();
    }


    public boolean lastName (String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        return pattern.matcher(name).matches();
    }



    public boolean validMail (String mail) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$");
        return pattern.matcher(mail).matches();
    }



    public boolean validMobile (String mobNum) {
        Pattern pattern = Pattern.compile("^[0-9]{1,3}[\\\\s][0-9]{10}$");
        return pattern.matcher(mobNum).matches();
    }

    public boolean ruleOne (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z]{8,}$");
        return pattern.matcher(password).matches();
    }


    public boolean ruleTwo (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1,}[a-zA-Z]{7,}$");
        return pattern.matcher(password).matches();
    }


    public boolean ruleThird (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}[a-zA-Z0-9]{7,}$");
        return pattern.matcher(password).matches();
    }


    public boolean ruleFourth (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
        return pattern.matcher(password).matches();
    }
}
