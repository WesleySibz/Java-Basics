public class Main {

    /**Create a Method
     A method must be declared within a class.
     It is defined with the name of the method, followed by parentheses ().
     Java provides some pre-defined methods, such as System.out.println(),
     but you can also create your own methods to perform certain actions:
     myMethod() is the name of the method*/

    static void myMethod() {
        String hello = "Hello";
        System.out.println(hello);
    }

    static void myMethod1(String name) {
        System.out.println(name + " welcome !!");
    }

    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethod3(int x) {
        return 5 + x;
    }

    static int myMethod4(int x, int y) {
        return x + y;
    }

    static int myMethod5(int x, int y) {
        return x + y;
    }

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {


         myMethod();

         /**
         static means that the method belongs to the Main class and not an object of the Main class.
         You will learn more about objects and how to access methods through objects later in this tutorial.
         void means that this method does not have a return value. You will learn more about return values
         later */

         /**Parameters and Arguments
          Information can be passed to methods as parameter. Parameters act as variables inside the method.

          Parameters are specified after the method name, inside the parentheses.
          You can add as many parameters as you want, just separate them with a comma.

          The following example has a method that takes a String called fname as parameter.
          When the method is called, we pass along a first name,
          which is used inside the method to print the full name:*/
        myMethod1("Liam");
        myMethod1("Jenny");
        myMethod1("Anja");

        /**Multiple Parameters
         You can have as many parameters as you like:
         */

        myMethod2("Liam", 5);
        myMethod2("Jenny", 8);
        myMethod2("Anja", 31);

        /**
         * Return Values
         * The void keyword, used in the examples above,
         * indicates that the method should not return a value.
         * If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
         * instead of void, and use the return keyword inside the method:*/

        System.out.println(myMethod3(3));

        //This example returns the sum of a method's two parameters:
        System.out.println(myMethod4(5, 3));

        //You can also store the result in a variable (recommended, as it is easier to read and maintain):
        int z = myMethod5(5, 3);
        System.out.println(z);

        /**
         * A Method with If...Else
         * It is common to use if...else statements inside methods:
         * */
        checkAge(20); // Call the checkAge method and pass along an age of 20
    }
}