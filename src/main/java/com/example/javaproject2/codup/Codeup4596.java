package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] inputNum = new int [9][9];
        int max = inputNum[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < inputNum.length; i++) {
            for (int j = 0; j < inputNum[i].length; j++) {
               inputNum[i][j] = sc.nextInt();
                if(max < inputNum[i][j]){
                    max = inputNum[i][j];
                    row = i+1;
                    col = j+1;
                }
            }

        }
        System.out.println(max);
        System.out.printf("%d %d",row,col);

    }
}
