package com.company;

public class Main {

    public static void main(String[] args) {
        /*The switch statement allows us to execute a block of code among many alternatives.
        The syntax of the switch statement in Java is:
                switch (expression) {

          case value1:
            // code
            break;

          case value2:
            // code
            break;

          ...
          ...

          default:
            // default statements
          }
          The expression is evaluated once and compared with the values of each case.

            If expression matches with value1, the code of case value1 are executed.
            Similarly, the code of case value2 is executed if expression matches with value2.
            If there is no match, the code of the default case is executed.
        */
        int number = 44;
        String size;

        // switch statement to check size
        switch (number) {

            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            // match the value of week
            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;

        }
        System.out.println("Size: " + size);
    }
}
