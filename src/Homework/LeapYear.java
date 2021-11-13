package Homework;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeapYear leapYear = new LeapYear();
        System.out.println("Enter a year and get know if year is leap:");
        int year = scanner.nextInt();
        System.out.println(leapYear.leapChecker(year));
    }

    public boolean leapChecker(int year) {
        return year%4==0;
    }
}
