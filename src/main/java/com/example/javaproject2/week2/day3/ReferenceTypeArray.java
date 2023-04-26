package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "수현1";
        students[0].phoneNumber = "010-0000-1111";
        students[0].age = 2;
        students[1] = new Student();
        students[1].name = "수현2";
        students[1].phoneNumber = "010-0000-2222";
        students[1].age = 22;
        System.out.println(students[0].name);
    }
}
