package com.example.javaproject2.codup;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Codeup1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howManyNum = sc.nextInt();
        int[] numArr = new int[howManyNum];
        for(int i = 0 ; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }

        int temp = 0;
        Arrays.sort(numArr);
        for (int num : numArr) {
            System.out.println(num);
        }
    }
}
