package com.example.javaproject2.programmers;

import java.util.Arrays;

public class Special2dArr {
    public static void main(String[] args) {
        Special2dArr s2a = new Special2dArr();
        s2a.solution(3);
    }
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];
        for (int i = 0; i < answer.length; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }

}
