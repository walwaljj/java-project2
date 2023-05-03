package com.example.javaproject2.programmers;

import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += num % i == 0 ? i : 0 ;
        }
        System.out.println(sum);
    }
}
