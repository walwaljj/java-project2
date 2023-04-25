package com.example.javaproject2.week2.day2;

public class StringFomatting {
    public static void main(String[] args) {
        String name = "정수현";
        int num = 10000;
        String formatString = String.format("%s 님의 잔고는 %d 원 입니다.", name, num);
        System.out.println("formatString = " + formatString);

    }
}
