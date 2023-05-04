package com.example.javaproject2.week3.day3;

public class SumOfOdds {
    public static void main(String[] args) {
        int answer = 0;
        int n = 10;

        for (int i = 0; i < n/2 ; i++) {
            answer += i*2+1;
        }
        System.out.println(answer);
    }
}
