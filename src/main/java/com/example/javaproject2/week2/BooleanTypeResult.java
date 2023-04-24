package com.example.javaproject2.week2;

public class BooleanTypeResult {
    public static void main(String[] args) {

        boolean isBalanceSufficient = true;
        boolean isPaymentSuccess = false;

        boolean result1 = 1 == 1;
        boolean result2 = 2 == 1;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        boolean i = Boolean.parseBoolean("0");
        System.out.println(i);
    }
}
