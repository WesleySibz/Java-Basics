package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	* As the name suggests, data types specify the type of data that can be stored inside variables in Java.
	* There are 8 data types predefined in Java programming language, known as primitive data types.
	*
	*/

        //1
        boolean flag = true;
        //The boolean data type has two possible values, either true or false.
        //Default value: false.
        //They are usually used for true/false conditions.

        //2
        byte range;
        range = 124;
        //The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
        //If it's certain that the value of a variable will be within -128 to 127, then it is used instead of int to save memory.
        //Default value: 0

        //3
        short temperature;
        temperature = -200;
        //The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
        //If it's certain that the value of a variable will be within -32768 and 32767, then it is used instead of other integer data types (int, long).
        //Default value: 0

        //4
        int range = -4250000;
        //The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
        //If you are using Java 8 or later, you can use an unsigned 32-bit integer. This will have a minimum value of 0 and a maximum value of 232-1. To learn more, visit How to use the unsigned integer in java 8?
        //Default value: 0

        //5
        long range = -42332200000L;
        //The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
        //If you are using Java 8 or later, you can use an unsigned 64-bit integer with a minimum value of 0 and a maximum value of 264-1.
        //Default value: 0

       //6
        double number = -42.3;
        //The double data type is a double-precision 64-bit floating-point.
        //It should never be used for precise values such as currency.
        //Default value: 0.0 (0.0d)

        //7
        float number = -42.3f;
        //The float data type is a single-precision 32-bit floating-point.Learn more about single-precision and double-precision floating-point if you are interested.
        //It should never be used for precise values such as currency.
        //Default value: 0.0 (0.0f)

        //8
        char letter = '\u0051';
        //It's a 16-bit Unicode character.
        //The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
        //Default value: '\u0000'

        String myString = "Java Programming";
        //Java also provides support for character strings via java.lang.String class. Strings in Java are not primitive types.


    }
}
