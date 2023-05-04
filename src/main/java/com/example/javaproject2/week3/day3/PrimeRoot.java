package com.example.javaproject2.week3.day3;

public class PrimeRoot {
    public static void main(String[] args) {

        int num = 17;
        String str = "소수입니다.";
        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0){
                str = "소수가 아닙니다.";
            }
        }
        System.out.println(str);
    }
}
