package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(comparison(15, -3));
        isPositiveVoid(19);
        System.out.println(whatIsYear(1400));
	// write your code here
    }

    public static boolean comparison (int first, int second) {
        if ((first + second) >= 10 && (first + second) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveVoid (int number) {
        if (number >= 0) {
            System.out.println("Передано положительное число.");
        } else {
            System.out.println("Передано отрицательное число.");
        }
    }

    public static boolean isPositive (int number) {
        if (number > 0) {
            return false;
        } else if (number < 0) {
            return true;
        } else { // в условии нет вводных что делать со значением параметра = 0.
            return true;
        }
    }

    public static void printText (String text, int count) {
        for (int i = 0; i < count; i++ ) {
            System.out.println(text);
        }
    }

    public static boolean whatIsYear (int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
