package com.example.javaproject2.week2.day4;

public class ComparisonOperatorsEx {
    public static void main(String[] args) {
        int iVal1 = 10;
        int iVal2 = 20;

        System.out.printf("iVal1 == iVal2 가 같니이이이 ? %b\n" ,iVal1 == iVal2); //false
        System.out.printf("iVal1 != iVal2 가 다르니 ? %b\n" ,iVal1 != iVal2); //true
        System.out.printf("iVal1 이 iVal2 보다 크니  ? %b\n" ,iVal1 > iVal2); // false
        System.out.printf("iVal1 이 iVal2 보다 크니  ? %b\n" ,iVal1 >= iVal2); // false
        System.out.printf("iVal1 이 iVal2 보다 작니 ? %b\n" ,iVal1 < iVal2); // true
        System.out.printf("iVal1 이 iVal2 보다 작거나 같니 ? %b\n" ,iVal1 <= iVal2); // true


    }
}
