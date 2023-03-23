package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Prompt the user to input their guess number
        System.out.println("What is the secret number?"); //ADDED

        // Collect user input
        Scanner reader = new Scanner(System.in);
        String guessedNumber = reader.nextLine(); //ADDED user input

        //if number is 8, print 'That is Correct! Are you psychic?'
        // otherwise print 'Sorry you got it wrong. Awkward :/
        if (guessedNumber.equals("8")) { //ADDED
            System.out.println("That is correct! Are you pyschic?");
        } else {
            System.out.println("Sorry you got it wrong. Awkward :/");
        }
    }
}
