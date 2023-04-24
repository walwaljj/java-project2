package com.example.javaproject2.week1.day5;

import com.example.javaproject2.week1.day2.PrintHello;

public class ConstantEx {
    final int NUM = 1;//멤버변수
    static final int STATIC_NUM = 2;//static 변수
    public static void main(String[] args) {
        final int sumOfMyAccount = 1000; //원시타입에서 사용

        final PrintHello printHello = new PrintHello();//참조타입에서 사용
    }
}
