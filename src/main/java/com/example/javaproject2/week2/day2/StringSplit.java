package com.example.javaproject2.week2.day2;

public class StringSplit {
    public static void main(String[] args) {
        String name = "정수현";
        String[] str = name.split("");
        System.out.printf("%s%s", str[1], str[2]);
        
    }
}
