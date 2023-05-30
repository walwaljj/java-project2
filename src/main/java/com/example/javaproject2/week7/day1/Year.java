package com.example.javaproject2.week7.day1;

public class Year {

    public static void main(String[] args) {
        checkLeapYear();
    }

    private static void checkLeapYear() {
        int year = 2020;
        String str = (year % 4 == 0 && year % 100 != 0) || year % 400 ==0 ? "윤년" : "평년";
        System.out.println(str);
    }
}
