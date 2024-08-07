package org.example;

public class Singleton {
    // Step 2: Private static variable of the same class that is the only instance of the class
    private static Singleton singleInstance;

    // Step 1: Private constructor to prevent instantiation from other classes
    private Singleton() {}

    // Step 3: Public static method that returns the instance of the class
    public static Singleton getInstance() {
        if (singleInstance == null) { // If no instance is created yet
            singleInstance = new Singleton(); // Create the single instance
        }
        return singleInstance; // Return the single instance
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

}
