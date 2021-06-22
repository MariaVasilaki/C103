package org.maria.m3;

public class Intro2 {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhile();

    }
    //Different type of loops...
    private static void forLoop() {
        for(int i =0; i <= 10; i++) {
            System.out.println("for loop 1: i = " + i );
        }
        System.out.println();
        for (int i =10; i >= 0; i-- ) {
            System.out.println("for loop 2: i = " + i );
        }
        System.out.println();
        String s = "C103";
        for (char c : s.toCharArray()){
            System.out.println("for loop 3: i = " +c);
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("for loop 4: i = " +c);
        }
    }

    private static void whileLoop(){
        int i = 0;
        while(i < 4) {
            System.out.println("while loop 1: i = " + i++);
        }
        System.out.println();

        i = 0;
        while(i<4){
            boolean isEven = i%2 == 0;
            i++;
            System.out.println("while loop 1: i is even " + isEven);
            if (isEven) {
                continue;
            }
            System.out.println("while loop 1: i is odd " + (i%2==1));
            if ( i ==3 ){
                break;
            }
        }
        System.out.println();

    }

    private static void doWhile() {
        int i = 0;
        do {
            System.out.println(i++);
        } while (i < 4) ; // when it is false, we are out.



    }


}
