package com.example.javaproject2.programmers;

import java.util.Arrays;

public class Factorization {
    public static void main(String[] args) {
        Factorization result = new Factorization();
        int[] solution = result.solution(420);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int n) {
        int[] answer = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                answer[count++] = i;
            }
        }
        if (count == 0) {
            return new int[]{n};
        }

        int isPrime = 0;

        int[] result = new int [count];

        for (int i = 0; i < count; i++) {
            if(getInts(answer[i])){
                result[isPrime++] = answer[i];
            }
        }

        return Arrays.copyOf(result, isPrime);
    }

    private static boolean getInts(int num) {
        for (int j = 2; j < num ; j++) {
            if (num % j == 0) {
                return false;
            }
        }
    return true;
    }
}
