package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};


        for (int i = 0; i < arr.length; i++) {
            int targetValue = arr[i];
            int targetIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(targetValue > arr[j]){
                    targetValue = arr[j];
                    targetIdx = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[ targetIdx];
            arr[ targetIdx] = temp;
        }




        System.out.println(Arrays.toString(arr));
    }
}
