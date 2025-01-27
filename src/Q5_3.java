// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 05 - Part 3

public class Q5_3 {

    // Method to print all patterns together
    public static void printPatterns(int size) {
        for (int i = 0; i < size; i++) {
            // Upper-half right triangle
            for (int j = 0; j < size; j++) {
                if (j >= i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }

            // Extra space between patterns
            System.out.print("    ");

            // Upper-half left triangle
            for (int j = 0; j < size; j++) {
                if (j <= size - 1 - i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }

            // Extra space between patterns
            System.out.print("    ");

            // X with closed top and bottom
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == i || j == size - 1 - i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }

            // Extra space between patterns
            System.out.print("    ");

            // Z pattern
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == size - 1 - i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 8; // To adjust the dimensions of the patterns

        // Print all patterns together
        printPatterns(size);
    }
}
