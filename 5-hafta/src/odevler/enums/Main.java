package odevler.enums;

import java.util.Scanner;

public class Main {

    // Create a Scanner object to read user input from the console
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompt the user to select a day of the week (1 to 7)
        System.out.print("Select Day (1: Sunday - 7: Saturday): ");
        int userSelect = scanner.nextInt();  // Read user's input as an integer
        scanner.nextLine(); // Consume the newline character

        // Get the corresponding Day enum constant based on user's input
        // Day.values() returns an array of all enum constants in declaration order
        Day selectedDay = Day.values()[userSelect - 1]; // Sunday is on index 0, hence the "-1"

        // Handle the user selection using switch expression
        switch (userSelect) {
            case 1, 2, 3, 4, 5, 6, 7 -> workHoursPrint(selectedDay);  // Call the method to print work hours
            default -> throw new IllegalStateException("Unexpected value: " + userSelect);  // Handle invalid input
        }
    }

    // Method to print the work hours for the selected day
    private static void workHoursPrint(Day day) {

        // Print the selected day (e.g., MONDAY)
        System.out.println("Selected day: " + day.name());

        // Print the formatted start and end times of the work shift
        // %-17s: left-align string in 17-character width
        // %2d:%02d: format hour and minute with leading zero if needed
        System.out.printf("%-17s %2d : %02d %n %-17s %2d : %02d %n",
                "Shift starts at:",
                day.getWorkDayStartHour(),
                day.getWorkDayStartMinute(),
                "Shift ends at:",
                day.getWorkDayFinishHour(),
                day.getWorkDayFinishMinute());
    }
}
