package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        * The break statement in Java terminates the loop immediately,
        * and the control of the program moves to the next statement following the loop.
        * It is almost always used with decision-making statements (Java if...else Statement).
        * Here is the syntax of the break statement in Java:
        * break;
        * */
        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

    }
}
