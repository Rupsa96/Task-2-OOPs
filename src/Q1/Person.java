package Q1;

/*
Q1. Create a class Person with properties name and age.

Requirements:
a) The default age of a person should be 18.
b) A person object can be initialized with name and age.
c) Create a method to display name and age of the person.
*/

public class Person {

    String name;
    int age;

    // Default constructor (no parameters)
    Person() {
        this.name = "Unknown"; // Assign default name
        this.age = 18;         // Assign default age as 18
    }

    // Parameterized constructor (takes name and age as input)
    Person(String name, int age) {
        this.name = name; // Initialize name using this keyword
        this.age = age;   // Initialize age using this keyword
    }

    // Method to display name and age
    void display() {
        System.out.println("Name: " + name); // Print name
        System.out.println("Age: " + age);   // Print age
    }

    // Main method
    public static void main(String[] args) {

        // Creating object using parameterized constructor
        Person p1 = new Person("Rupsa", 100);

        // Calling display method for p1
        p1.display();

        // Creating object using default constructor
        Person p2 = new Person();

        // Calling display method for p2
        p2.display();
    }
}