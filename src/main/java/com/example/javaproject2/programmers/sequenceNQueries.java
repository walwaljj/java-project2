package com.example.javaproject2.programmers;

import java.util.Arrays;

public class sequenceNQueries {
    public static void main(String[] args) {
        sequenceNQueries snq = new sequenceNQueries();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        snq.solution(arr,queries);
    }
    public int[] solution(int[] arr, int[][] queries) {
//        int[] answer = {arr.length};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < queries.length; j++) {
                    temp = arr[queries[j][0]];
                    arr[queries[j][0]] = arr[queries[j][1]];
                    arr[queries[j][1]] = temp;
//                for (int k  = 0; k < queries[j].length; k++) {
//                    temp = arr[queries[j][0]];
//                    arr[queries[j][0]] = arr[queries[j][1]];
//                    arr[queries[j][1]] = temp;
//                    System.out.println(queries[j][k]);
//                    System.out.println(arr[queries[j][k]]);

//                }
//                System.out.println(arr[queries[j][0]]);
            }
//            System.out.println(Arrays.toString(arr));
        }
//        Arrays.toString(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        return arr;
    }
}
