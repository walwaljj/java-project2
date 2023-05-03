package com.example.javaproject2.codup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[sc.nextInt()];

        for (int i = 0; i < numArr.length; i++) {
            int num = sc.nextInt();
            numArr[i] = num;
        }

        Arrays.sort(numArr);
        System.out.println(numArr[0]);
    }
}
