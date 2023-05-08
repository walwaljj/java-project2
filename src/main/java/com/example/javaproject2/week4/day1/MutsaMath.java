package com.example.javaproject2.week4.day1;

public class MutsaMath {

    private int sumOfFactors(int num) {
        int sum = 0;
        for (int j = 1; j <= num; j++) {
            if(num % j == 0) sum += j;
        }
        return sum;
    }

    public void printResult (int num){
        System.out.println(num +"의 약수들의 합은 "+ sumOfFactors(num) + " 입니다.");
    }
}
