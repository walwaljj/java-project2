package com.example.javaproject2.codup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArr = new int[sc.nextInt()][sc.nextInt()];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt(); // 길이
            int d = sc.nextInt(); // 방향 , 1이면 세로
            int x = sc.nextInt()-1; // 시작
            int y = sc.nextInt()-1; // 시작
            for (int j = 0; j < l; j++) {
                if(d == 0) {
                    numArr[x][y+j] = 1;
                } else if ((d == 1)) {
                    numArr[x+j][y] = 1;
                }
            }
        }

        for (int[] ints : numArr) {
            for (int anInt : ints) {
                System.out.print(anInt+ " ");
            }
            System.out.println();
        }
    }
}
