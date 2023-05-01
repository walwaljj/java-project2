package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastNum = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= lastNum ; i+=2) {
            result += i;

        }
        System.out.println(result);
    }
}
