package com.Bridgelabz;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" Please enter the First Name: ");
        String name = scan.nextLine();

        UserRegistration userDetails = new UserRegistration();
        userDetails.firstName(name);

    }
}
