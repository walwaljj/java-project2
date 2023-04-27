package com.example.javaproject2.week2.day4;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int age = 31;

        boolean isAdult = age >= 18;
        System.out.printf("미성년자입니까?>>>???? %b", !isAdult);

    }
}
