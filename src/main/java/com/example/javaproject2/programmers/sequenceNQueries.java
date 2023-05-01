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
        int temp = 0;
        for (int i = 0; i < queries.length; i++) {
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;

        }

        return arr;
    }
}
