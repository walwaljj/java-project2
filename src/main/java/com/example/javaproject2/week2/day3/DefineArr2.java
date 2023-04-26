package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class DefineArr2 {
    public static void main(String[] args) {
        int[] iArr = new int[]{1,2,3,4};

        int[][] arr1 = new int[3][2];
        int[][] arr2 = new int[6][7];

        int[][] arr3 = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(Arrays.toString(arr3[1]));
        System.out.println(Arrays.toString(arr3[2]));

        System.out.println(arr3[0][0]);

    }
}
