package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int starCount = 1;


        for (int i = 0; i < num; i++) {
            int spaceCount = num - starCount / 2 ;
            for (int j = 1; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < spaceCount; j++) {
                System.out.print(" ");
            }
            System.out.println();
            starCount += 2;
        }


    }
}
