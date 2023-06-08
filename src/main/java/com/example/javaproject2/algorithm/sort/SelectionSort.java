package com.example.javaproject2.algorithm.sort;


import java.util.Arrays;

/**
 * 선택 정렬 : O(N²)
 * 가장 앞의 원소와 작은 숫자의 자리를 교환한다.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {25, 12, 18, 24, 2, 21};
        int n = arr.length;

        for (int i = 0; i < n - 1 ; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];//변경 대상의 값(제일 앞인덱스의 값)을 넣어주기
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
