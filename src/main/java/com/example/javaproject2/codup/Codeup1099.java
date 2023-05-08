package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArr = new int[10][10];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }

        int j = 1;
        for (int i = 1; i <= numArr.length-1; i++) {
            while ( numArr[i][j] != 2){
                if(numArr[i][j] != 1 ){
                    numArr[i][j++] = 9;
                } else if (numArr[i][j] == 1) {
                    j = j - 1 ;
                    break;
                }
            }
            if(numArr[i][j] == 2){
                numArr[i][j] = 9;
                break;
            }
        }

        for (int[] ints : numArr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
