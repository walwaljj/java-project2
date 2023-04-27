package com.example.javaproject2.week2.day4;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;

        if( age >= 18 && !isStudent ) {
            System.out.printf("학생이 아닌 성인입니다.\n");
        }

        boolean result = true && true;
        System.out.printf("%b\n", result);
        result = true && false;
        System.out.printf("%b\n", result);
        result = false && true;
        System.out.printf("%b\n", result);
        result = false && false;
        System.out.printf("%b\n", result);


    }
}
