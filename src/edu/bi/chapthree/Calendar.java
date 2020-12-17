package edu.bi.chapthree;

import java.util.*;

public class Calendar {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("number of days in the month? ");
        int daysInMonth = console.nextInt();
        System.out.print("date of first Sunday? ");
        int dateOfFirstSunday = console.nextInt();

        printCalendar(dateOfFirstSunday, daysInMonth);
    }

    //creates the calendar
    public static void printCalendar(int dateOfFirstSunday, int daysInMonth) {
        printHeader();

            int firstDay = (7 - dateOfFirstSunday);

            //prints the first week if there are blank days
            if (firstDay < 6) {
                for (int blank = (6 - firstDay); blank <= 6; blank++) {
                    System.out.print("|      ");
                }
                for (int i = 1 + firstDay; i <= 6; i++) {
                    System.out.print("|   " + (i - firstDay) + "  ");
                }
                System.out.print("|\n");
            }

        //print first full week
        for (int i = dateOfFirstSunday; i < (dateOfFirstSunday + 7); i++) {
            if (i < 10) {
                System.out.print("|   " + i + "  ");
            } else if (i >= 10) {
                System.out.print("|  " + i + "  ");
            }
        }
        System.out.print("|\n");

        //print second full week
        for (int i = (dateOfFirstSunday + 7); i < (dateOfFirstSunday + 14); i++) {
            if (i < 10) {
                System.out.print("|   " + i + "  ");
            } else if (i >= 10) {
                System.out.print("|  " + i + "  ");
            }
        }
        System.out.print("|\n");

        //print third full week
        for (int i = (dateOfFirstSunday + 14); i < (dateOfFirstSunday + 21); i++) {
            System.out.print("|  " + i + "  ");
        }
        System.out.print("|\n");

        //print fourth full week
        for (int i = (dateOfFirstSunday + 21); i < (dateOfFirstSunday + 28); i++) {
            if (i <= daysInMonth) {
                System.out.print("|  " + i + "  ");
            } else if (i > daysInMonth) {
                System.out.print("|      ");
            }
        }
        System.out.print("|\n");

        //prints final week
        if ((dateOfFirstSunday + 28) <= daysInMonth) {
            for (int i = (dateOfFirstSunday + 28); i < (dateOfFirstSunday + 35); i++) {
                if (i <= daysInMonth) {
                    System.out.print("|  " + i + "  ");
                } else if (i > daysInMonth) {
                    System.out.print("|      ");
                }
            }
            System.out.print("|\n");
        }

        //closes the calendar
        for (int z = 1; z <= 7; z++) {
            System.out.print("+------");
        }
        System.out.println("+");
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
