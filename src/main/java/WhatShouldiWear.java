package org.example;
import java.util.Scanner;

public class WhatShouldiWear {
    public static void main(String[] args) {
        //Create a program that makes suggestions on what to wear based on information it gathers about the weather.
        Scanner input = new Scanner(System.in);

        //Prompt user to input what the weather was like
        System.out.println("What is the weather like: rainy, sunny, cloudy or snow?");
        String weather = input.nextLine();

        //Prompt user oto input what the average temp of the day is
        System.out.println("What is the average temperature for the day?");
        int temperature = input.nextInt(); //ADDED user numerial input, using int instead of a String.

        // if the weather is rainy print "you should a wear raincoat"
        if (weather.equals("rainy")) {
            System.out.println("I would recommend a raincoat");
        }





    }
}
