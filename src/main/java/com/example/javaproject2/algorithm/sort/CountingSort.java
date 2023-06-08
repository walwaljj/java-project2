package com.example.javaproject2.algorithm.sort;

import java.util.Arrays;

/**
 * 카운팅 sort
 * 정렬 대상 배열을 순회하며 숫자를 카운트해서 새로운 배열에 카운트한 숫자를담아줌
 * 그 카운트된 숫자는 정렬 대상 배열의 인덱스가 됨.
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 3, 0, 5, 2, 5, 1};
        int n = arr.length;
        int min = arr[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(min + " , " + max);

        int k = max - min + 1;
        int[] counts = new int [k];

        for (int data : arr) {
            counts[data]++;
        }

        for (int i = 0; i < k - 1; i++) {
            counts[i + 1] += counts[i];
        }

        System.out.println(Arrays.toString(counts));

        int[] output = new int[n];

        for (int i = n - 1; i >= 0 ; i--) {
            int position = counts[arr[i]];
            position--;
            output[position] = arr[i];
            counts[arr[i]]--;
        }

        System.out.println(Arrays.toString(output));
    }
}
