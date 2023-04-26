package com.example.javaproject2.week2.day3;

import com.example.javaproject2.week1.day2.PrintHello;

public class RefrenceTypeVariable {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[30];

        Object obj = new Student(); // 클래스의 가장 상위는 object 모든 타입을 수용할 수 있다.
        Object obj2 = new PrintHello(); // 클래스의 가장 상위는 object 모든 타입을 수용할 수 있다.
        //Object 는 클래스임. new 로 생성가능하다.
        //클래스 = 객체 = 참조타입.

    }
}
