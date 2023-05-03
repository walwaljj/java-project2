package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long result = a;

        for (int i = 0; i < n-1 ; i++) {
            result = (result * m) + d;
        }
        System.out.println(result);
    }
}
