package com.example.javaproject2.week1.day4;

public class PrintfDate {
    public static void main(String[] args) {
        System.out.printf("%d\n",12);
        System.out.printf("%02d\n",14);
        System.out.printf("%02d\n",4);
        //2024 , 2 , 15 를 2024-02-15형태로 출력하기
        System.out.printf("%d-%02d-%02d",2024,2,15);
    }
}
