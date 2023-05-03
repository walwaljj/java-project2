package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long result =  a * ( (long)Math.pow( d , n-1));


        System.out.println(result);
    }
}
