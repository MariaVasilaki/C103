package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a number from 1 to 12");
        int userInput = sc.nextInt();
        if (userInput == 1) {
            System.out.println("January - Garnet");
        } else if(userInput == 2){
            System.out.println("February - Amethyst");
        } else if(userInput == 3){
            System.out.println("March - Aquamarine");
        } else if(userInput == 4){
            System.out.println("April - Diamond");
        } else if (userInput == 5){
            System.out.println("May - Emerald");
        } else if(userInput == 6){
            System.out.println("June - Pear");
        } else if (userInput == 7){
            System.out.println("July - Ruby");
        } else if (userInput == 8){
            System.out.println("August - Peridot");
        } else if (userInput == 9){
            System.out.println("September - Sapphire");
        } else if(userInput == 10){
            System.out.println("October - Opal");
        } else if(userInput == 11){
            System.out.println("November - Topaz");
        } else if(userInput == 12){
            System.out.println("December - Turquoise");
        } else {
            System.out.println("Please give a number in the right range!");
        }

    }
}
