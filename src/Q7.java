// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 07
// Code Structure: A simple while-loop has been used to calculate the substance decay.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the substance name
        System.out.print("Enter the name of the substance: ");
        String substanceName = scanner.nextLine();

        // Get the half-life
        System.out.print("Enter the half-life of the substance (in years): ");
        double halfLife = scanner.nextDouble();

        // Initialize decay variables
        double remainingPercentage = 100.0; // Starts at 100%
        int years = 0;

        // Loop to calculate decay
        while (remainingPercentage >= 2.0) {
            remainingPercentage /= 2; // Halve the remaining percentage
            years += halfLife;       // Add the half-life duration
        }

        // Display results
        System.out.println("The substance " + substanceName + " will take approximately " + years +
                " years to decay to less than 2% of its original amount.");

        scanner.close();
    }
}
