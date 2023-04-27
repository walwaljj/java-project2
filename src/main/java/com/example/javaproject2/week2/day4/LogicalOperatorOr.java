package com.example.javaproject2.week2.day4;

public class LogicalOperatorOr {
    public static void main(String[] args) {
        int yearsOfExp = 9;
        int numOfProj = 12;

        boolean isPromotion = yearsOfExp > 5 || numOfProj > 10;

        System.out.printf("팀장 승진 여부: %b\n",isPromotion);


        boolean result = true || true;
        System.out.printf("%b\n", result);
        result = true || false;
        System.out.printf("%b\n", result);
        result = false || true;
        System.out.printf("%b\n", result);
        result = false || false;
        System.out.printf("%b\n", result);

    }
}
