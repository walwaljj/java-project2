package com.example.javaproject2.programmers;

import java.util.Arrays;

public class lessons181925 {
    public static void main(String[] args) {
        int[] log = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String str = "";
        for (int i = 1; i < log.length; i++) {

            int move = log[i] - log[i - 1];

            if (move == 1) {
                str += "w";
            } else if (move == -1) {
                str += "s";
            } else if (move == 10) {
                str += "d";
            } else {
                str += "a";
            }

        }

        System.out.println(str);

    }
}
