package com.example.javaproject2.programmers;

import java.util.Arrays;

public class ZeroOrFive {
    public static void main(String[] args) {
        int n = 2;
        int num = 252;
        int count = 0;
        int[] numArr = new int[num];

        for (int i = n; i < num ; i++) {
            if(isZeroOrFive(i)){
                numArr[count++] = i;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(numArr,count)));
    }

    private static boolean isZeroOrFive(int num) {
        boolean bl = false;
        while (num > 0){
            if(num % 10 != 5 && num % 10 != 0){
                return bl;
            }else {
                num /= 10;
            }
        }
        return true;
    }
}
