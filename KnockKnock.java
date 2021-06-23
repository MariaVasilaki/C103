package com.sg.foundations.flowcontrol.ifs;

import java.util.Locale;
import java.util.Scanner;

public class KnockKnock {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine().toUpperCase();
        String correctName = "MartyMcFly".toUpperCase();

        if (nameGuess.equals(correctName)) { // .equals() checks if two objects are tbe same under the reference variable name.
            // == checks if the two have the same address in memory
            System.out.println("Hey! That's right! I'm back!"); // Wrong capitalisation gives another word!
            System.out.println(".... from the Future."); // Sorry, had to!
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
