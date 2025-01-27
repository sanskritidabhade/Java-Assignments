// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 05 - Part 2

public class Q5_2 {
    public static void main(String[] args) {
        printMultiplicationTriangle();
    }

    public static void printMultiplicationTriangle() {
        // Print header row
        System.out.printf("%4s", ""); // Align header with first column
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Print the triangular pattern
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i); // Print the row header
            for (int j = 1; j <= i; j++) { // Only go up to the current row number
                System.out.printf("%4d", i * j); // Print the product
            }
            System.out.println(); // Move to the next row
        }
    }
}
