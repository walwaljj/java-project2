package com.example.javaproject2.programmers;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        for (int i = 0 ; i < width ; i++){
            System.out.print("*");
            for (int j = 0 ; j < length-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
