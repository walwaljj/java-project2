package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrEx {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        printArr(arr);


        arr[0][0] = 9;
        arr[0][2] = 9;
        arr[2][2] = 9;

        printArr(arr);

    }

    private static void printArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-----------------------");
    }
}
