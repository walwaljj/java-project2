package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long result = 0;

        for (int i = 1 ; ; i++) {
            if ( i % a == 0 && i % b == 0 && i % c == 0 ){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
