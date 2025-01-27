// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 02
// Code Structure:
/* The program has a shift(char letter, int val) method which shifts the char letter by int val and returns the new character.
An array has been used to store the alphabet (in lowercase). A for-loop runs through the array and uses a conditional if statement
where it is checked whether the input character matches any element from the array.

In short, user will get a valid and correct output without worrying about case-sensitivity.
*/

import java.util.Scanner;

public class Q2 {
    public static char shift(char letter, int val) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // Handle case sensitivity by converting letter to lowercase
        boolean isUpperCase = Character.isUpperCase(letter);
        letter = Character.toLowerCase(letter);

        // Find the index of the letter in the alphabet
        for (int i = 0; i < 26; i++) {
            if (letter == alphabet[i]) {
                // Compute the new index using modular arithmetic
                int newIndex = (i + val) % 26;
                if (newIndex < 0) {
                    newIndex += 26; // Handle negative shifts
                }

                // Return the shifted character, restoring case if needed
                return isUpperCase ? Character.toUpperCase(alphabet[newIndex]) : alphabet[newIndex];
            }
        }

        // If the input is not a valid letter, return the original character
        return letter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for a character
        System.out.print("Enter a character to shift in the alphabet: ");
        String input = sc.next();
        char character = input.charAt(0);

        // Ask the user for the shift value
        System.out.print("Enter a value for shifting the character: ");
        int n = sc.nextInt();

        // Call the shift method and display the result
        char shiftedCharacter = shift(character, n);
        System.out.println("The new character is: " + shiftedCharacter);
    }
}

