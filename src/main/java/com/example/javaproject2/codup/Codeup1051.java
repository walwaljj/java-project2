package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNum = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(strNum[0]);
        int num2 = Integer.parseInt(strNum[1]);
        int isBigger = num1 <= num2 ? 1 : 0;
        System.out.println(isBigger);
    }
}
