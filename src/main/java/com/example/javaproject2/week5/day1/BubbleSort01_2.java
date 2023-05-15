package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort01_2 {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11,1};
        BubbleSort01_2 bs = new BubbleSort01_2();
        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr = sortARound(arr, i);
        }
        return arr;
    }

    private int[] sortARound(int[] arr,int i) {
        for (int j = 0; j < arr.length - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp2 = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp2;
            }
        }return arr;
    }
}
