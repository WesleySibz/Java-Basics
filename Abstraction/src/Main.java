abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
//From the example above, it is not possible to create an object of the Animal class:
//To access the abstract class, it must be inherited from another class.
// Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:
public class Main {
    /**Abstract Classes and Methods
     Data abstraction is the process of hiding certain details and showing only essential information to the user.
     Abstraction can be achieved with either abstract classes or interfaces
     (which you will learn more about in the next chapter).

     The abstract keyword is a non-access modifier, used for classes and methods:

     Abstract class: is a restricted class that cannot be used to create objects
     (to access it, it must be inherited from another class).

     Abstract method: can only be used in an abstract class, and it does not have a body.
     The body is provided by the subclass (inherited from).
     An abstract class can have both abstract and regular methods:*/
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}