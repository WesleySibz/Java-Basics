# Encapsulation

What is Encapsulation in Java?
Encapsulation in Java is a mechanism to wrap up variables(data) and methods(code) together as a single unit. It is the process of hiding information details and protecting data and behavior of the object. It is one of the four important OOP concepts. The encapsulate class is easy to test, so it is also better for unit testing.

To understand what is encapsulation in detail consider the following bank account class with deposit and show balance methods

    class Account {
        private int account_number;
        private int account_balance;

        public void show Data() {
            //code to show data 
        }

        public void deposit(int a) {
            if (a < 0) {
                //show error 
            } else
                account_balance = account_balance + a;
        }
    }

Suppose a hacker managed to gain access to the code of your bank account. Now, he tries to deposit amount -100 into your account by two ways. Let see his first method or approach.

Approach 1: He tries to deposit an invalid amount (say -100) into your bank account by manipulating the code.
Now, the question is – Is that possible? Let investigate.

Usually, a variable in a class are set as “private” as shown below. It can only be accessed with the methods defined in the class. No other class or object can access them.
If a data member is private, it means it can only be accessed within the same class. No outside class can access private data member or variable of other class.

So in our case hacker cannot deposit amount -100 to your account.
Approach 2: Hacker’s first approach failed to deposit the amount. Next, he tries to do deposit a amount -100 by using “deposit” method.
But method implementation has a check for negative values. So the second approach also fails.
Thus, you never expose your data to an external party. Which makes your application secure.
The entire code can be thought of a capsule, and you can only communicate through the messages. Hence the name encapsulation.

Data Hiding in Java
Data Hiding in Java is hiding the variables of a class from other classes. It can only be accessed through the method of their current class. It hides the implementation details from the users. But more than data hiding, it is meant for better management or grouping of related data.

To achieve a lesser degree of encapsulation in Java, you can use modifiers like “protected” or “public”. With encapsulation, developers can change one part of the code easily without affecting other.

Getter and Setter in Java
Getter and Setter in Java are two conventional methods used to retrieve and update values of a variable. They are mainly used to create, modify, delete and view the variable values. The setter method is used for updating values and the getter method is used for reading or retrieving the values. They are also known as an accessor and mutator.

The following code is an example of getter and setter methods:

class Account{ 
private int account_number;
private int account_balance; 
    // getter method
	public int getBalance() {
        return this.account_balance;
    }
    // setter method
	public void setNumber(int num) {
        this.account_number = num;
    }
}
In above example, getBalance() method is getter method that reads value of variable account_balance and setNumber() method is setter method that sets or update value for variable account_number.


Abstraction vs. Encapsulation
Often encapsulation is misunderstood with Abstraction. Lets study-

Encapsulation is more about “How” to achieve a functionality
Abstraction is more about “What” a class can do.
A simple example to understand this difference is a mobile phone. Where the complex logic in the circuit board is encapsulated in a touch screen, and the interface is provided to abstract it out.

Advantages of Encapsulation in Java
Encapsulation is binding the data with its related functionalities. Here functionalities mean “methods” and data means “variables”
So we keep variable and methods in one place. That place is “class.” Class is the base for encapsulation.
With Java Encapsulation, you can hide (restrict access) to critical data members in your code, which improves security
As we discussed earlier, if a data member is declared “private”, then it can only be accessed within the same class. No outside class can access data member (variable) of other class.
However, if you need to access these variables, you have to use public “getter” and “setter” methods.