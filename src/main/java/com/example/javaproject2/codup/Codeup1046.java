package com.example.javaproject2.codup;


import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNumArr = sc.nextLine().split(" ");
        int sum = Integer.parseInt(strNumArr[0]) + Integer.parseInt(strNumArr[1]) + Integer.parseInt(strNumArr[2]);
        System.out.printf("%d\n", sum);
        System.out.printf("%.1f\n",(float) sum / strNumArr.length);

    }
}
