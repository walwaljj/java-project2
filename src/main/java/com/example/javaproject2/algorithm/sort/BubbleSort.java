package com.example.javaproject2.algorithm.sort;

import java.util.Arrays;

/**
 * 버블 정렬 : O(N²)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {36,12,18,15,41,19};
        int n = arr.length;

        //n - 1 번 째 원소와 n 번째 원소를 비교하기
        for (int i = 0; i < n - 1; i++) {

            // 정렬이 완료된 원소는 제거하고 반복문을 돌리기 위해 -i 를 함.
            for (int j = 0; j < n - 1 - i; j++) {

                //왼쪽 원소가 오른쪽 원소보다 클 경우 교환한다.
                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
