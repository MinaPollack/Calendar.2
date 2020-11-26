package edu.bi.chapthree;

import java.util.*;

public class Calendar {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("number of days in the month? ");
        int days = console.nextInt();
        System.out.print("date of first Sunday? ");
        int date = console.nextInt();

        printCalendar(date, days);
    }

    //creates the calendar
    public static void printCalendar(int date, int days) {
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
        System.out.print("|  ");
        for (int t = 7; t >= date; t--) {
            for (int i = date - 6; i <= 1; i++) {
                System.out.print(date - t + "  |  ");
            }
            System.out.println();
            System.out.print("|  ");
        }
        for (int y = date; y < 10; y++) {
            System.out.print(y + "  |  ");
        }
        for (int z = 10; z <= days; z++) {
            System.out.print(z + "  |  ");
        }
        for (int x = 1; x <= 7; x++) {
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
        System.out.println("");
    }
}
