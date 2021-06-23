package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	* if (condition) {
        // statements
        }
	* */
        int number = 10;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
                }

                System.out.println("Statement outside if block");
        /*
        * if (condition) {
              // codes in if block
            }
            else {
              // codes in else block
            }
        * */

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // execute this block
        // if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");
    }
}
