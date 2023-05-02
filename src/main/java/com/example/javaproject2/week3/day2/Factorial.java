package com.example.javaproject2.week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;// 0 으로 하면 안됨. n * 0 은 항상 0임에 주의!

        for (int i = n; i >= 1  ; i-- ) {
            answer *= i;
        }
        System.out.println("multiplication  = " + answer);
    }
}
