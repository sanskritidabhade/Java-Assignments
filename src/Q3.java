// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 03
// Code Structure:
/* The program uses Boolean.toString() method only. The test cases are included in the main() method.
*/

public class Q3 {
    public static String boolToString(boolean value) {
        return Boolean.toString(value);
    }

    public static void main(String[] args) {
        // Test the method
        System.out.println(boolToString(true));  // Output: "true"
        System.out.println(boolToString(false)); // Output: "false"
    }
}
