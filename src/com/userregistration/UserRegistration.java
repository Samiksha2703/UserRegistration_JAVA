package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    private static final Scanner input = new Scanner(System.in);

    //method to validate first name
    private static void isFirstNameValid() {
        System.out.println("Enter First Name.");
        String firstName = input.next();
        if (firstName == null) {
            System.out.println("Empty Field.");
        } else {
            if (firstName.matches("^[A-Z]{1}[a-z]{2,}$")) {
                System.out.println("First Name is Valid");
            } else {
                System.out.println("First Name is Invalid");
            }
        }
    }

    //method to validate last name
    private static void isLastNameValid() {
        System.out.println("Enter Last Name.");
        String lastName = input.next();
        if (lastName == null) {
            System.out.println("Empty Field.");
        } else {
            if (lastName.matches("^[A-Z]{1}[a-z]{2,}$")) {
                System.out.println("Last Name is Valid");
            } else {
                System.out.println("Last Name is Invalid");
            }
        }
    }

    //method to validate email id
    private static void isEmailIdValid() {
        System.out.println("Enter Email-Id.");
        String emailId = input.next();
        if emailId == null){
            System.out.println("Empty Field.");
        } else{
            if (emailId.matches("^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$")) {
                System.out.println("E-mail Id is Valid");
            } else {
                System.out.println("E-mail Id is Invalid");
            }
        }
    }

    //method to validate mobile number
    private static void isMobileNumberValid(){
        System.out.println("Enter Mobile Number.");
        String mobile = input.next();
        if (mobile == null){
            System.out.println("Empty Field.");
        } else{
            if (mobile.matches("^[0-9]{2}[0-9]{10}$")) {
                System.out.println("Mobile Number is Valid");
            } else {
                System.out.println("Mobile Number is Invalid");
            }
        }
    }
    
    public static void main(String[] args) {
        //calling method to validate first name
        isFirstNameValid();
        //calling method to validate first name
        isLastNameValid();
        //calling method to validate first name
        isEmailIdValid();
        isMobileNumberValid();
    }
}

