package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {

        int[] numArr = new int [23];
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1 ; i <= count ; i++) {
            int num = sc.nextInt();
            numArr[num-1]++;

        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}
//1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
