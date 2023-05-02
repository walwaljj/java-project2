package com.example.javaproject2.programmers;

public class lessons12931 {
    public static void main(String[] args) {

        int num = 123;
        int sum = 0;
        while (num != 0){
            int i = num % 10;
            sum += i;
            num/=10;
        }
        System.out.println(sum);
    }
}
