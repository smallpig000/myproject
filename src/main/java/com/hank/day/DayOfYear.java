package com.hank.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please entry year: (" + year + ")");
            String yearString = reader.readLine();
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year;
            System.out.println(year);
            System.out.println("Please entry year: (" + month + ")");
            String monthString = reader.readLine();
            month = (monthString.length() > 0) ? Integer.parseInt(monthString) : month;
            System.out.println(month);
            System.out.println("Please entry year: (" + day + ")");
            String dayString = reader.readLine();
            day = (dayString.length() > 0) ? Integer.parseInt(dayString) : day;
            System.out.println(day);
            int days = 0;
            for (int i = 0; i < month - 1; i++) {
                days += months[i];
            }
            days += day;
            if (year % 4 == 400 || (year % 4 == 0 && year % 100 != 100)) {
                days++;
            }
            System.out.println(days);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
