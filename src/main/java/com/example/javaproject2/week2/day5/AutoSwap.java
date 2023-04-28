package com.example.javaproject2.week2.day5;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        //오름차순 정렬
        int[] arr = {2, 1, 7, 9};
        boolean cheak = arr[0] > arr[1];

        if(cheak){
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
