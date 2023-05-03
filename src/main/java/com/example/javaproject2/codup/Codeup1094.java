package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int [sc.nextInt()];

        for (int i = 0 ; i < numArr.length ; i++) {
            int num = sc.nextInt();
            numArr[i] = num;
        }

        for (int i = numArr.length-1 ; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }
    }
}
//1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
