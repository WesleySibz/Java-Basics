package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        * The continue statement skips the current iteration of a loop (for, while, do...while, etc).
        * After the continue statement, the program moves to the end of the loop. And, test expression is evaluated (update statement is evaluated in case of the for loop).
        * Here's the syntax of the continue statement.
        * continue;
        * */
        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if value of i is between 4 and 9
            // continue is executed
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
