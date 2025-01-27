// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 04
// Code Structure: The computations have been done within the main method itself. A simple for-loop accomplishes the task.

public class Q4 {
    public static void main(String[] args) {
        System.out.printf("%-5s %-10s %-10s%n", "N", "SQUARE", "CUBE");
        for (int n = 1; n <= 5; n++) {
            System.out.printf("%-5d %-10d %-10d%n", n, n * n, n * n * n);
        }
    }
}

