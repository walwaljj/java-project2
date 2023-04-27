package com.example.javaproject2.week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        answer = answer + num % 10;
        System.out.printf("answer:%d\n",answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);


        int num2 = 687;
        int answer2 = 0;
        for (int i = 0 ; num2 > 0 ; i ++){
            answer2 += num2 % 10;
            num2 = num2 / 10 ;
        }

        System.out.println(answer2);
    }
}
