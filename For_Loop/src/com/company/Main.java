package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        * Java for loop is used to run a block of code for a certain number of times.
        * The syntax of for loop is:
        * for (initialExpression; testExpression; updateExpression) {
                // body of the loop
            }
            * The initialExpression initializes and/or declares variables and executes only once.
                The condition is evaluated. If the condition is true, the body of the for loop is executed.
                The updateExpression updates the value of initialExpression.
                The condition is evaluated again. The process continues until the condition is false.
        * */
            int n = 5;
            // for loop
            for (int i = 1; i <= n; ++i) {
                System.out.println("Java is fun");
            }
        }
    }
