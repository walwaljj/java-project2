package com.example.javaproject2.week3.day3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 17;
        boolean result = true;
        for (int i = 2 ; i < num ; i++) { // 1은 모든 수가 나눠 떨어지기 때문에 시작 수가 될 수 없다.
            if(num % i == 0){ // 자신의 수 (num) 전 까지 나눴을 때 나머지가 0 이면 true == 소수가 아님
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
