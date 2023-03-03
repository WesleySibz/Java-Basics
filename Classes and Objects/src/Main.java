public class Main {
    int x = 5;

    /**Java Classes/Objects
     Java is an object-oriented programming language.

     Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

     A Class is like an object constructor, or a "blueprint" for creating objects.

     Create a Class
     To create a class, use the keyword class:
     public class Main {
     int x = 5;
     }

     Create an Object
     In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

     To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

     Create an object called "myObj" and print the value of x:
     */

    public static void main(String[] args) {

        Main myObj = new Main();
        System.out.println(myObj.x);

        //Multiple Objects
        //You can create multiple objects of one class:
        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        /**
         * Using Multiple Classes
         * You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).
         *
         * Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:
         *
         * Main.java
         * Second.java*/
    }
}

class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}