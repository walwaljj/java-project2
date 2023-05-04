package com.example.javaproject2.programmers;

import java.util.Arrays;

public class MinTest {
    public static void main(String[] args) {
        int[] arr =  {0, 1, 2, 4, 3};
        int num = 2;
        int[] biggerArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > num){
                biggerArr[count++] = arr[i];
                System.out.println(arr[i]);
            }
        }

        int[] ints = Arrays.copyOf(biggerArr, count);
        Arrays.sort(ints);
        System.out.println(ints[0]);


    }
}
