import java.util.Scanner;

public class Q1_main {
    public static String getDayOfWeek(int day){
        String dayName = "";
        int dayNumber = day % 7;

        // Assuming the year is 2004 as given in the question's example.
        switch (dayNumber) {
            case 0:
                dayName = "Wednesday";
                break;
            case 1:
                dayName = "Thursday";
                break;
            case 2:
                dayName = "Friday";
                break;
            case 3:
                dayName = "Saturday";
                break;
            case 4:
                dayName = "Sunday";
                break;
            case 5:
                dayName = "Monday";
                break;
            case 6:
                dayName = "Tuesday";
                break;
            default:
                System.out.println("Error occurred.");
                break;
        }
        return dayName;
    }

    public static int getDay(int month, int dayOfMonth){
        int dayOfYear = 0;
        int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < month; i++){
            dayOfYear += monthLength[i];
        }
        dayOfYear += dayOfMonth;
        return dayOfYear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the year:");
        int day = sc.nextInt();

        if (day < 1 || day > 366)
            System.out.println("Please enter a valid day between 1 and 366!");
        else
            System.out.println("The Day of Week is: " + getDayOfWeek(day));

        System.out.println("Enter the month number:");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Please enter a valid month between 1-12!");
        }

        System.out.println("Enter the day of the month:");
        int dayOfMonth = sc.nextInt();
        if (dayOfMonth < 1 || dayOfMonth > 31) {
            System.out.println("Please enter a valid day between 1-31!");
        }

        System.out.printf("Days: %d", getDay(month, dayOfMonth));

    }

}
