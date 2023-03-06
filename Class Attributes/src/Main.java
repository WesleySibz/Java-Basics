public class Main {
    /**Java Class Attributes
     In the previous chapter, we used the term "variable" for x in the example (as shown below).
     It is actually an attribute of the class.
     Or you could say that class attributes are variables within a class:*/
    //Create a class called "Main" with two attributes: x and y:
    int x = 5;
    int z = 10;
    int y = 3;
    //If you don't want the ability to override existing values, declare the attribute as final:
    final int k = 10;
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args) {

        /**Accessing Attributes
         You can access attributes by creating an object of the class, and by using the dot syntax (.):

         The following example will create an object of the Main class, with the name myObj.
         We use the x attribute on the object to print its value:*/
        //Create an object called "myObj" and print the value of x:
        Main myObj = new Main();
        System.out.println(myObj.x);

        //Modify Attributes
        //You can also modify attribute values:
        myObj.x = 40;
        System.out.println(myObj.x);

        //Or override existing values:
        myObj.z = 25; // z is now 25
        System.out.println(myObj.x);

        //myObj.k = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.k);

        //Multiple Objects
        //If you create multiple objects of one class, you can change the attribute values in one object,
        // without affecting the attribute values in the other:
        //Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:
        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25

        //Multiple Attributes
        //You can specify as many attributes as you want:
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}