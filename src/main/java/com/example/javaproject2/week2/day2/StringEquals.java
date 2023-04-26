package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        String aa1 = "정수현".substring(0, 1);
//        "정수현".split("")[0];
        String[] aa2 = "정수현".split("");
        String aa3 = "정";
        System.out.println(aa2[0]==aa1); //false
        System.out.println(aa2[0]==aa3); //false
        System.out.println(aa1.equals(aa2[0])); //true

    }
}
