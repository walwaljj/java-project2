package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sortAround(int[] arr, int i){
        for (int j = 1+i; j < arr.length - 1; j++) {
            if (arr[i] < arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }return arr;
    }

    public int[] sort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++) {
            sortAround(arr,i);
        }return arr;
    }
    public static void main(String[] args) {
        BubbleSort02 bs = new BubbleSort02();
        int[] arr = {7,2,3,9,28,11,1};

        int temp = arr[0];
        arr[1] = arr[0];
        arr[0] = temp;

        temp = arr[0];
        arr[1] = arr[0];
        arr[0] = temp;

        temp = arr[0];
        arr[1] = arr[0];
        arr[0] = temp;

        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
