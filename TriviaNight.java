package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args) {
        int correctAnswers =0;
        int wrongAnswers =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1");
        System.out.println("What is our instructor's name?");
        System.out.println("1. Harry");
        System.out.println("2. Tim");
        System.out.println("3. Ron");
        System.out.println("4. Mark");
        int userInput = sc.nextInt();
        if (userInput == 3) {
            System.out.println("Right!");
            correctAnswers ++;
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Wrong Answers: " + wrongAnswers);
        } else {
            System.out.println("Unfortunately, you missed it!");
            wrongAnswers++;
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Wrong Answers: " + wrongAnswers);
        }
        System.out.println();
        System.out.println("Question 2");
        System.out.println("What is this training about?");
        System.out.println("1. Java");
        System.out.println("2. C++");
        System.out.println("3. Ruby");
        System.out.println("4. Python");
        userInput = sc.nextInt();
        if (userInput == 1) {
            System.out.println("Right!");
            correctAnswers ++;
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Wrong Answers: " + wrongAnswers);
        } else {
            System.out.println("Unfortunately, you missed it!");
            wrongAnswers++;
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Wrong Answers: " + wrongAnswers);
        }
        System.out.println();
        System.out.println("Question 3");
        System.out.println("What is the value of pi?");
        System.out.println("1. 2.44");
        System.out.println("2. 3.14");
        System.out.println("3. 8.99");
        System.out.println("4. 3.13");
        userInput = sc.nextInt();
        if (userInput == 2) {
            System.out.println("Right!");
            correctAnswers ++;
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Wrong Answers: " + wrongAnswers);
        } else {
            System.out.println("Unfortunately, you missed it!");
            wrongAnswers++;
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Wrong Answers: " + wrongAnswers);
        }
        if (correctAnswers == 3) {
            System.out.println("Awesome! All your answers were correct!");
        } else if(correctAnswers == 2) {
            System.out.println("2/3! Well done!");
        } else if(correctAnswers ==1) {
            System.out.println("Hmm... you could have done better than 1/3");
        } else {
            System.out.println("Wish you luck next time!");
        }

    }
}
