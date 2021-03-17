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

        public static void main(String[] args) {
            //calling method to validate first name
            isFirstNameValid();
        }
    }

