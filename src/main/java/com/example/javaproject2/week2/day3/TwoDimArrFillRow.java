package com.example.javaproject2.week2.day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] iarr = new int[5][5];
        int rowNum = sc.nextInt();
        addLine(iarr, rowNum);
    }

    public static void addLine(int iArr[][] , int rowNum){
        for(int i = 0 ; i < 5 ; i ++){
            iArr[rowNum][i] = 1;
        }

        for(int i = 0 ; i < 5 ; i ++){
            System.out.println(Arrays.toString(iArr[i]));
        }
        System.out.println("-----------------------");

    }


}
