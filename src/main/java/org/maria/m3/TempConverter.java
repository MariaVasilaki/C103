package org.maria.m3;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("32F = " + convertF2C(32) + "C");
        // System.out.println("212F ");
        System.out.println("0C = " + convertC2F(0) + "F");
    }

    private static double convertF2C(double f) {
        return (f-32)/9 * 5;
    }

    private static double convertC2F(double c) {
        return c * 9/5+32 ;
    }
}
