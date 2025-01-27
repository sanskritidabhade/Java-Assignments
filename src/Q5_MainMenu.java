// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 05
// Code Structure:
/* This is the Main Menu file for Question 5. Run this file directly to evaluate results for Part 1, 2, and 3
of Question 5. If needed, individual classes will also provide results when run separately.
The individual classes have comments added for explanation instead of code structure explanation.
*/

import java.util.Scanner;

public class Q5_MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("Select an option:");
            System.out.println("1. printCharString(char Ch, int N) method");
            System.out.println("2. printMultiplicationTriangle() method");
            System.out.println("3. printPatterns(int size) method");
            System.out.println("4. Exit");

            // Get the user's choice
            int choice = scanner.nextInt();

            // Handle the user's choice
            switch (choice) {
                case 1:
                    // Call the main method of the first class
                    Q5_1.main(args);
                    break;
                case 2:
                    // Call the main method of the second class
                    Q5_2.main(args);
                    break;
                case 3:
                    // Call the main method of the third class
                    Q5_3.main(args);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
