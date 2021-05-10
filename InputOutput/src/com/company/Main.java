package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	* In Java, you can simply use

        System.out.println(); or

        System.out.print(); or

        System.out.printf();
      to send output to standard output (screen).

        Here,

        System is a class
        out is a public static field: it accepts output data.
        * Java provides different ways to get input from the user. However, in this tutorial,
        * you will learn to get input from user using the object of Scanner class.
        * In order to use the object of Scanner, we need to import java.util.Scanner package.
        * create an object of Scanner
        * Scanner input = new Scanner(System.in);
        * take input from the user
        * int number = input.nextInt();
	* */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
