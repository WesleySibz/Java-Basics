# Abstraction in OOPs? Java Abstract Class & Method

What is Abstraction in OOP?
Abstraction is the concept of object-oriented programming that “shows” only essential attributes and “hides” unnecessary information. The main purpose of abstraction is hiding the unnecessary details from the users. Abstraction is selecting data from a larger pool to show only relevant details of the object to the user. It helps in reducing programming complexity and efforts. It is one of the most important concepts of OOPs.
Let’s Study Abstraction in OOPs with example:
Suppose you want to create a banking application and you are asked to collect all the information about your customer. There are chances that you will come up with following information about the customer
But, not all of the above information is required to create a banking application.

So, you need to select only the useful information for your banking application from that pool. Data like name, address, tax information, etc. make sense for a banking application which is an Abstraction example in OOPs
Since we have fetched/removed/selected the customer information from a larger pool, the process is referred as Abstraction in OOPs.

However, the same information once extracted can be used for a wide range of applications. For instance, you can use the same data for hospital application, job portal application, a Government database, etc. with little or no modification. Hence, it becomes your Master Data. This is an advantage of Abstraction in OOPs.
Difference between Abstraction and Encapsulation
Abstraction:
Abstraction in Object Oriented Programming solves the issues at the design level.
Abstraction in Programming is about hiding unwanted details while showing most essential information.
Data Abstraction in Java allows focussing on what the information object must contain

Encapsulation:
Encapsulation solves it implementation level.
Encapsulation means binding the code and data into a single unit.
Encapsulation means hiding the internal details or mechanics of how an object does something for security reasons.

Difference between Abstract Class and Interface
Abstract Class:
An abstract class can have both abstract and non-abstract methods.
It does not support multiple inheritances.
It can provide the implementation of the interface.
An abstract class can have protected and abstract public methods.
An abstract class can have final, static, or static final variable with any access specifier.

Interface:
The interface can have only abstract methods.
It supports multiple inheritances.
It can not provide the implementation of the abstract class.
An interface can have only have public abstract methods.
The interface can only have a public static final variable.

What is Abstract Class?
Abstract Class is a type of class in OOPs, that declare one or more abstract methods. These classes can have abstract methods as well as concrete methods. A normal class cannot have abstract methods. An abstract class is a class that contains at least one abstract method.

What are Abstract Methods?
Abstract Method is a method that has just the method definition but does not contain implementation. A method without a body is known as an Abstract Method. It must be declared in an abstract class. The abstract method will never be final because the abstract class must implement all the abstract methods.

Advantages of Abstraction
The main benefit of using an Abstraction in Programming is that it allows you to group several related classes as siblings.
Abstraction in Object Oriented Programming helps to reduce the complexity of the design and implementation process of software.

When to use Abstract Methods & Abstract Class?
Abstract methods are mostly declared where two or more subclasses are also doing the same thing in different ways through different implementations. It also extends the same Abstract class and offers different implementations of the abstract methods.

Abstract classes help to describe generic types of behaviors and object-oriented programming class hierarchy. It also describes subclasses to offer implementation details of the abstract class.

[informations referance: Guru99.com. (2019). OOPS Concepts in Java with Examples. [online] Available at: https://www.guru99.com/java-data-abstraction.html.]