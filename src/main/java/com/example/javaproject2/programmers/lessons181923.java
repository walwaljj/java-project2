package com.example.javaproject2.programmers;

import java.util.Arrays;

public class lessons181923 {
    public static void main(String[] args) {
        lessons181923 lessons = new lessons181923();
        int[] arr =  {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        lessons.solution(arr, queries);

    }

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        int[] numArr = new int[arr.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0] ; j <= queries[i][1]; j++) {
                if(queries[i][2] < arr[j] ) {
                    numArr[count++] = arr[j];
                }
            }
            if (count == 0){
                answer[i] = -1;
            }else{
                int[] ints = Arrays.copyOf(numArr, count);
                Arrays.sort(ints);
                answer[i] = ints[0];
                count = 0;
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
