package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        * Java while loop is used to run a specific code until a certain condition is met.
        * The syntax of the while loop is:
        * while (testExpression) {
                // body of loop
            }
            * A while loop evaluates the textExpression inside the parenthesis ().
                If the textExpression evaluates to true, the code inside the while loop is executed.
                The textExpression is evaluated again.
                This process continues until the textExpression is false.
                When the textExpression evaluates to false, the loop stops.
        * */
        // declare variables
        int i = 1, n = 5;

        // while loop from 1 to 5
        while(i <= n) {
            System.out.println(i);
            i++;
        }
        /*
        * The do...while loop is similar to while loop.
        * However, the body of do...while loop is executed once before the test expression is checked.
        * do {
                // body of loop
            } while(textExpression)
            * The body of the loop is executed at first. Then the textExpression is evaluated.
            If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
            The textExpression is evaluated once again.
            If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
            This process continues until the textExpression evaluates to false. Then the loop stops.
         * */
        int j = 1, k = 5;

        // do...while loop from 1 to 5
        do {
            System.out.println(j);
            j++;
        } while(i <= k);
    }
}
