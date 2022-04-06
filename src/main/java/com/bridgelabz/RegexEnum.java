package com.bridgelabz;
public enum RegexEnum {
    name("^[A-Z]{1}+[a-z]{2,}$"),
    email("^[a-zA-z0-9.+-]+[@]+[a-zA-z0-9]+[.]+[a-zA-z0-9.]{2,}$"),
    phone("^[9][1]+\\s\\d{10}$"),
    password("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"),
    ;

    private String regex;

    public String getRegex() {
        return regex;
    }
    RegexEnum(String regex) {
        this.regex = regex;
    }
}