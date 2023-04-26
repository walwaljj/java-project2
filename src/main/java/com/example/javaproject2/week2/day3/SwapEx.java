package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class SwapEx {

    public static void main(String[] args) {

        int[] arr = {3,5,1,6,2};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
