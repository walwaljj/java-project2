package com.example.javaproject2.week7.day1;

public class Year {

    public static void main(String[] args) {
        Year year = new Year();
        int i = 2020;
        if(year.checkLeapYear(i)){
            System.out.println(i + " O" );
        }else{
            System.out.println(i + " X");
        }

    }

    public boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    }

    public boolean isLeapYear(int year) {
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        if(year % 4 == 0) return true;
        else {return false;}
    }
}
