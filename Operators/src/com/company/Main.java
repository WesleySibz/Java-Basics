package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	* Operators are symbols that perform operations on variables and values.
	* For example, + is an operator used for addition, while * is also an operator used for multiplication.
	* Operators in Java can be classified into 5 types:
	*/

	//Arithmetic Operators: Arithmetic operators are used to perform arithmetic operations on variables and data.
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

	//Assignment Operators: Assignment operators are used in Java to assign values to variables.
        int d = 4;
        int var;

        // assign value using =
        var = d;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += d;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= d;
        System.out.println("var using *=: " + var);

	//Relational Operators: Relational operators are used to check the relationship between two operands.
         a = 7;
         b = 11;

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true

	//Logical Operators: Logical operators are used to check whether an expression is true or false. They are used in decision making.
        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

	//Unary Operators: Unary operators are used with only one operand. For example, ++ is a unary operator that increases the value of a variable by 1. That is, ++5 will return 6.
        a = 12;
        b = 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + a);

        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b);

        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);

	//Bitwise Operators: Bitwise operators in Java are used to perform operations on individual bits.
        /*
        * ~	Bitwise Complement
        <<	Left Shift
        >>	Right Shift
        >>>	Unsigned Right Shift
        &	Bitwise AND
        ^	Bitwise exclusive OR
        * */
        
    //Java instanceof Operator: The instanceof operator checks whether an object is an instanceof a particular class.
        String str = "Programiz";
        boolean result;

        // checks if str is an instance of
        // the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);

    }
}
