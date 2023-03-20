import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class
public class Main {
    /**Java ArrayList
     The ArrayList class is a resizable array, which can be found in the java.util package.

     The difference between a built-in array and an ArrayList in Java,
     is that the size of an array cannot be modified
     (if you want to add or remove elements to/from an array, you have to create a new one).
     While elements can be added and removed from an ArrayList whenever you want.
     The syntax is also slightly different:
     Create an ArrayList object called cars that will store strings:*/

    /**Add Items
     The ArrayList class has many useful methods.
     For example, to add elements to the ArrayList, use the add() method:*/

    /**Access an Item
     To access an element in the ArrayList, use the get() method and refer to the index number:*/

    /**Change an Item
     To modify an element, use the set() method and refer to the index number:*/

    /**Remove an Item
     To remove an element, use the remove() method and refer to the index number:*/

    /**ArrayList Size
     To find out how many elements an ArrayList have, use the size method:*/

    /**Loop Through an ArrayList
     Loop through the elements of an ArrayList with a for loop,
     and use the size() method to specify how many times the loop should run:*/

    /**Other Types
     Elements in an ArrayList are actually objects.
     In the examples above, we created elements (objects) of type "String".
     Remember that a String in Java is an object (not a primitive type).
     To use other types, such as int, you must specify an equivalent wrapper class: Integer.
     For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
     Create an ArrayList to store numbers (add elements of type Integer):*/

    /**Sort an ArrayList
     Another useful class in the java.util package is the Collections class,
     which include the sort() method for sorting lists alphabetically or numerically:*/

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.get(0);
        //Remember: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        cars.set(0, "Opel");

        cars.remove(0);
        //To remove all the elements in the ArrayList, use the clear() method:
        cars.clear();

        cars.size();

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        //You can also loop through an ArrayList with the for-each loop:
        for (String i : cars) {
            System.out.println(i);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
        //Sort an ArrayList of Integers:
        Collections.sort(myNumbers);  // Sort myNumbers
        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}