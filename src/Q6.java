// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 06
// Code Structure: A simple while loop integrated with a conditional if-statement is implemented to complete the task.
// The if-statement checking whether the numbers are consecutive and greater than previous can be considered the most crucial line of code for this program.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int previousNumber = scanner.nextInt(); // Start with the first number
        System.out.println("Keep entering consecutive numbers (one greater than the previous).");

        while (true) {
            System.out.println("Enter the next number:");
            int currentNumber = scanner.nextInt();

            if (currentNumber != previousNumber + 1) { // Checking conditions of consecutive numbers and greater
                System.out.println("Error: " + currentNumber + " is not consecutive to " + previousNumber);
                break;
            }

            // Update the previous number
            previousNumber = currentNumber;
        }

        System.out.println("Program ended. Thank you!");
        scanner.close();
    }
}
