package edu.bi.chapthree;

import java.util.*;

//Convention:
// days week are 0 - 6, week starts with Sunday
public class Calendar {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("number of days in the month? ");
        int days = console.nextInt();
        System.out.print("date of first Sunday? ");
        int dateOfFirstSunday = console.nextInt();

        printCalendar(dateOfFirstSunday, days);
    }

    //creates the calendar
    public static void printCalendar(int dateOfFirstSunday, int days) {
        printHeader();

        int dayOfFirst = dayOfFirst(dateOfFirstSunday);

        //print blank squares at beginning of first week
        for (int i = 0; i < dayOfFirst; i++) {
            printCalendarSquare("     ");
        }

        //print rest of first week
        for (int i = dayOfFirst; i < 7; i++) {
            printCalendarSquare("   " + (i-dayOfFirst+1) + "  ");
        }
        //prepares for next line
        System.out.print("|\n");

        // print middle weeks

        //print end week

        //prints the first week
        System.out.print("|  ");
        for (int t = 7; t >= 7; t--) {
            int i = (dateOfFirstSunday - 6);
            for (int j = i; j <= 1; j++) {
                System.out.print("    |  ");
            }
        }

        for (int l = dateOfFirstSunday; l > 1; l--) {
            int k = dateOfFirstSunday;
            System.out.print(" " + ((k + 1) - l) + "  |  ");
        }
        System.out.println();
        //prints body weeks
        System.out.print("|  ");
            for (int x = dateOfFirstSunday; x < 10; x++) {
                System.out.print(" " + x + "  |  ");
                for (int w = x; w >= (dateOfFirstSunday + 7); w--) {
                    System.out.println();
                    System.out.print("|   " + x + "  |  ");
                }
                System.out.println();
            }

            for (int y = 10; y <= days; y++) {
                System.out.print(y + "  |  ");
            }
            System.out.println();
            System.out.println("|  ");

        //closes the calendar
        for (int z = 1; z <= 7; z++) {
            System.out.print("+------");
        }
        System.out.println("+");
    }

    private static void printCalendarSquare(String s) {
        System.out.print("|" + s);
    }

    //if dateOfFirstSunday == 1, then return 0
    // otherwise 8 - dateOfFirstSunday
    private static int dayOfFirst(int dateOfFirstSunday) {
        return (8-dateOfFirstSunday)%7;
    }

    private static void printHeader() {
        System.out.print("  Sun  ");
        System.out.print("  Mon  ");
        System.out.print("  Tue  ");
        System.out.print("  Wed  ");
        System.out.print("  Thu  ");
        System.out.print("  Fri  ");
        System.out.println("  Sat  ");
        for (int i = 1; i <= 7; i++) {
            System.out.print("+------");
        }
        System.out.println("+");
    }

    //intro for the user
    public static void giveIntro() {
        System.out.println("This program creates a calendar");
        System.out.println("based on the number of days in the month");
        System.out.println("and the date of the first Sunday.");
        System.out.println("The number of days can be from 28 to 31,");
        System.out.println("and the date of the first Sunday an be from 1 to 7");
        System.out.println();
    }
}
