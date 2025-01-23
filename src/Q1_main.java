// Name: Sanskriti Avinash Dabhade | Student ID: 1225131
// Assignment 01 | Question 01
// Code Structure:
// The program code includes methods: getDayOfWeek(int day) & getDay(int month, int dayOfMonth) along with a main method
// in the same java file ("Q1_main.java") for ease of evaluation. Simply run the program file and input details as prompted.

import java.util.Scanner;

public class Q1_main {
// A method that tells what day of the week someone’s birthday falls on this year (2025).
    public static String getDayOfWeek(int day){
        String dayName = "";
        int startDay = 3; // Wednesday = 3
        // Calculation below will provide us a number between 0-6. Each representing a day of the week as shown in the switch-case implementation below.
        int dayNumber = (startDay + (day-1)) % 7;

        // Assuming the year is 2025 as mentioned. January 1st 2025 is a Wednesday.
        switch (dayNumber) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                System.out.println("Error occurred."); // Unlikely to happen at all.
                break;
        }
        return dayName;
    }

    // A method that takes the month and day as parameters and returns what day of the year it is.
    public static int getDay(int month, int dayOfMonth){
        int dayOfYear = 0;
        // An array which includes number of days of each month in chronological order.
        int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Feb. 2025 has 28 days.

        for (int i = 1; i < month; i++){
            dayOfYear += monthLength[i-1];
        }

        dayOfYear += dayOfMonth;
        return dayOfYear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day, month, dayOfMonth;

        // Use of getDayOfWeek(int day) method. do-while loop used to discard invalid input.
        do {
            System.out.print("Enter your birthday (between 1-365): ");
            day = sc.nextInt();
            System.out.println();
        } while (day < 1 || day > 365);

        System.out.println("Your birthday falls on a " + getDayOfWeek(day) + " in 2025.");
        System.out.println();

        // Use of the getDay(int month, int dayOfMonth) method. do-while loops used to discard invalid inputs.
        do {
            System.out.print("Enter the month number (between 1-12): ");
            month = sc.nextInt();
            System.out.println();
        } while (month < 1 || month > 12);

        do {
            System.out.print("Enter the day of the month: ");
            dayOfMonth = sc.nextInt();
            System.out.println();
        } while (dayOfMonth < 1 || dayOfMonth > 31);

        System.out.printf("Days: %d", getDay(month, dayOfMonth));

    }

}
