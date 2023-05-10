package com.example.javaproject2.week4.day3;

import java.util.Scanner;

public class Diamond_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int starCount = 1;
        int half = num / 2;
        int spaceCount = (num - starCount ) / 2 ;
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            System.out.println();

            if( i >= half ){
                starCount -= 2;
                spaceCount += 1;
            }else {
                starCount += 2;
                spaceCount -= 1;
            }
        }


    }
}
