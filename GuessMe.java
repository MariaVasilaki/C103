package com.sg.foundations.flowcontrol.ifs;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 12;
        System.out.println("Please give a number.");
        int userInput = sc.nextInt();
        System.out.println("The user chose the number: " + userInput);
        if (userInput == choice) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (userInput < choice){
            System.out.println( "Ha, nice try - too low! I chose " + choice + ".");
        }
        else {
            System.out.println("Too bad, way too high. I chose " + choice + ".");
        }
    }



}
