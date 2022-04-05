package com.bridgelabz;
import java.util.Scanner;

public class UserRegistrationCases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration userDetails = new UserRegistration();

        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate E-mail Id ");
        System.out.println("Enter 4 : to validate Mobile Number ");
        System.out.println("Enter 5 : to validate Password Rule 1 ");
        System.out.println("Enter 6 : to validate Password Rule 2 ");
        System.out.println("Enter 7 : to validate Password Rule 3 ");
        System.out.println("Enter 8 : to validate Password Rule 4 ");

        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        String name = " ";
        String mail = " ";
        String mobNum = " ";
        String password = " ";

        switch (choice) {
            case 1:
                System.out.println("Enter the first name: ");
                name = scanner.next();
                userDetails.firstName(name);
                break;
            case 2:
                System.out.println("Enter the last name: ");
                name = scanner.next();
                userDetails.lastName(name);
                break;
            case 3:
                System.out.println("Enter the email: ");
                mail = scanner.next();
                userDetails.validMail(mail);
                break;
            case 4:
                System.out.println("Enter the mobile number: ");
                mobNum = scanner.next();
                userDetails.validMobile(mobNum);
                break;
            case 5:
                System.out.println("Enter password for first rule: ");
                password = scanner.next();
                userDetails.ruleOne(password);
                break;
            case 6:
                System.out.println("Enter password for second rule: ");
                password = scanner.next();
                userDetails.ruleTwo(password);
                break;
            case 7:
                System.out.println("Enter password for third rule: ");
                password = scanner.next();
                userDetails.ruleThird(password);
                break;
            case 8:
                System.out.println("Enter password for fourth rule: ");
                password = scanner.next();
                userDetails.ruleFourth(password);
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}