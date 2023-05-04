package com.example.javaproject2.week3.day4;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {2,1,31,6,7};
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value < arr[i]){
                value = arr[i];
            }
        }

        System.out.println(value);
    }
}
