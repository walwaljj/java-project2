package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        String aa1 = "GOLD".substring(0, 1);
        String[] aa2 = "GOLD".split("");
        String aa3 = "G";
        System.out.println(aa2[0]==aa1);
        System.out.println(aa1.equals(aa2));
        System.out.println(aa2[0]==aa3);
    }
}
