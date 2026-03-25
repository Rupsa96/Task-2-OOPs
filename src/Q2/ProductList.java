package Q2;

import java.util.Scanner;

/*
Q2. Create a class Product with attributes pid, price, and quantity.

Requirements:
a) Use a parameterized constructor to initialize product details.
b) Accept details of 5 products from the user and store them in an array.
c) Find and display the product ID with the highest price.
d) Create a method to calculate and return the total amount spent on all products.
   (Total = price × quantity for each product)
*/

// Product class to store product details
class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor to initialize product details
    Product(int pid, double price, int quantity) {
        this.pid = pid;           // Assign input pid to instance variable
        this.price = price;       // Assign input price to instance variable
        this.quantity = quantity; // Assign input quantity to instance variable
    }
}

// Main class to run the program
public class ProductList {

    // Static method to calculate total amount spent on products
    static double calculateTotal(Product[] products) {
        double total = 0; // Variable to store total amount

        // for loop to iterate through array
        for (int i = 0; i < products.length; i++) {
            total += products[i].price * products[i].quantity; // Add price * quantity
        }

        return total; // Return total amount
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        Product[] products = new Product[5]; // Create array to store 5 products

        // Loop to take input for 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter pid, price, quantity:");

            int pid = sc.nextInt();        // Read product ID
            double price = sc.nextDouble(); // Read price
            int quantity = sc.nextInt();  // Read quantity

            products[i] = new Product(pid, price, quantity); // Store object in array
        }

        // Initialize max price using first product
        double maxPrice = products[0].price;

        // Initialize product ID of max price product
        int maxPid = products[0].pid;

        // Loop to find product with the highest price
        for (int i = 0; i < products.length; i++) {
            if (products[i].price > maxPrice) { // Compare prices
                maxPrice = products[i].price;   // Update max price
                maxPid = products[i].pid;       // Update product ID
            }
        }

        // Print product ID with the highest price
        System.out.println("Product ID with highest price: " + maxPid);

        // Call method to calculate total amount
        double total = calculateTotal(products);

        // Print total amount spent
        System.out.println("Total amount spent: " + total);
    }
}