package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class AvgEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.1f", (scanner.nextFloat() + scanner.nextFloat() + scanner.nextFloat() )/3);
        System.out.printf("%.1f", (scanner.nextInt() + scanner.nextInt() + scanner.nextInt() )/3.0f);
    }

}
