public class Main {
    public static void main(String[] args) {

        /**Java Strings
         Strings are used for storing text.

         A String variable contains a collection of characters surrounded by double quotes:*/

        String greeting = "Hello";

        /**String Length
         A String in Java is actually an object,
         which contain methods that can perform certain operations on strings.
         For example, the length of a string can be found with the length() method:
         */

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        /**String Methods
         There are many string methods available, for example toUpperCase() and toLowerCase():
         */

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        /**Finding a Character in a String
         The indexOf() method returns the index (the position)
         of the first occurrence of a specified text in a string
         (including whitespace):*/

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7
    }
}