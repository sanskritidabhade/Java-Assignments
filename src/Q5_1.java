// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 05 - Part 1

import java.util.Scanner;

public class Q5_1 {

        public static void printCharString(char Ch, int N) {
            // Create a string by repeating the character N times
            StringBuilder sb = new StringBuilder(); // in-built method to construct the sequence
            for (int i = 0; i < N; i++) {
                sb.append(Ch);
            }

            // Print the resulting string
            System.out.println(sb.toString());
        }

        public static void main(String[] args) {
            char ch;
            String input;
            int n;
            Scanner sc = new Scanner(System.in);

            // Ask user for a character to be printed
            System.out.print("Enter a character: ");
            input = sc.next();
            ch = input.charAt(0);

            // Ask user the number of times the character should be printed
            System.out.print("How many characters would you like to print? : ");
            n = sc.nextInt();
            printCharString(ch, n);
        }

}
