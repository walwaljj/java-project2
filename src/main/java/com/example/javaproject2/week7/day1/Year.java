package com.example.javaproject2.week7.day1;

public class Year {

    public static void main(String[] args) {
        int i = 2020;
        if(checkLeapYear(i)){
            System.out.println(i + " O" );
        }else{
            System.out.println(i + " X");
        }

    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? true : false;

    }
}