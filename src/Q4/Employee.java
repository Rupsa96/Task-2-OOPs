package Q4;

/*
Q4. Define a base class Person with attributes name and age.

Requirements:
a) Create a subclass Employee that inherits from Person.
b) Add attributes employeeId and salary in Employee.
c) Use the super keyword to initialize Person attributes in Employee constructor.
d) Create a method to display all details.
*/

// Base class Person
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name; // Initialize name
        this.age = age;   // Initialize age
    }
}

// Derived class Employee inheriting from Person
public class Employee extends Person {

    int employeeId;
    double salary;

    // Constructor for Employee class
    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);       // Call parent class constructor
        this.employeeId = employeeId; // Initialize employee ID
        this.salary = salary;         // Initialize salary
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);           // Print name (inherited)
        System.out.println("Age: " + age);             // Print age (inherited)
        System.out.println("Employee ID: " + employeeId); // Print employee ID
        System.out.println("Salary: " + salary);       // Print salary
    }

    // Main method
    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee("Rupsa", 26, 101, 50000);

        // Call display method
        emp.display();
    }
}