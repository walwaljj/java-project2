package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNum = sc.nextLine().split(" ");
        int iVal1 = Integer.parseInt(strNum[0]);
        int iVal2 = Integer.parseInt(strNum[1]);
        int iVal3 = Integer.parseInt(strNum[2]);

        int min1 = iVal1 < iVal2 ? iVal1 : iVal2;
        int min2 = iVal2 < iVal3 ? iVal2 : iVal3;

        System.out.println(min1 < min2 ? min1 : min2);


    }
}
