package com.example.javaproject2.week2.day2;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        System.out.println( Arrays.toString(arr) );

        int[] intArr = new int[]{3,2,1,0,0};
        System.out.println(Arrays.toString(intArr));
        
        String[] str = new String[5];
        System.out.println( Arrays.toString(str));
    }
}
