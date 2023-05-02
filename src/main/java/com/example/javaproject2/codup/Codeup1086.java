package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.printf("%.02f MB\n",((h * b * c ) /1024f)/8f/1024f);
        ;
    }
}
