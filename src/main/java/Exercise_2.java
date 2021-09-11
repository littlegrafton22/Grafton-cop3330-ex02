/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        //Beginning of program
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String str = input.nextLine();

        //length of the String
        System.out.println("Did you know your name has " + str.length() + " characters");

    }
}
