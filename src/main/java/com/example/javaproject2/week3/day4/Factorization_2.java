package com.example.javaproject2.week3.day4;

import java.util.Arrays;

public class Factorization_2 {
    public static void main(String[] args) {
        Factorization_2 result = new Factorization_2();
        int[] solution = result.solution(12);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int n) {
        int[] answer = new int[n];
        int idxCount = 0;
        int div = 2;

        while (n > 1) {
            if (n % div == 0) {
                answer[idxCount++] = div;
                n /= div;
            } else {
                div++;
            }
        }

        int[] arr = new int[idxCount];
        for (int i = 0  ; i < idxCount; i++) {

            for (int j = 0; j < i; j++) {
                arr[i] = answer[j];
                if (answer[i] == answer[j]){
                    arr[i-1] = answer[j];

                }
            }

        }

        System.out.println(Arrays.toString(arr));
//        return answer;
        return Arrays.copyOf(answer, idxCount);

    }
}
