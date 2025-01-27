// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 08
// Code Structure: Nested for-loops are used and explanations are provided for each block.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for four values
        int[] values = new int[4];
        System.out.println("Enter four values (positive integers):");
        for (int i = 0; i < 4; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();

            // Ensure the value is positive
            if (values[i] < 0) {
                System.out.println("Please enter a positive integer.");
                i--; // Retry the input
            }
        }

        // Find the maximum value to determine the graph height
        int maxValue = 0;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // Draw the vertical bar graph
        System.out.println("\nBar Graph:");
        for (int i = maxValue; i > 0; i--) { // Start from the max value
            for (int j = 0; j < 4; j++) {
                if (values[j] >= i) {
                    System.out.print("**  "); // Print two stars if the value is >= current row
                } else {
                    System.out.print("    "); // Print spaces otherwise
                }
            }
            System.out.println(); // Move to the next line
        }

        // Print the base line
        System.out.println("----------------");

        // Print the labels
        for (int i = 1; i <= 4; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.println();

        scanner.close();
    }
}
