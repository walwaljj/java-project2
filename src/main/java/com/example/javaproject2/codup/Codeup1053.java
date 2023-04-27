package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNum = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(strNum[0]);
        int isZero = num1 == 0 ? 1 : 0;
        System.out.println(isZero);
    }
}
