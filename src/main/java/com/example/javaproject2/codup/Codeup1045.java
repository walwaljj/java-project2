package com.example.javaproject2.codup;


import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNumArr = sc.nextLine().split(" ");
        System.out.printf("%d\n", Integer.parseInt(strNumArr[0])+Integer.parseInt(strNumArr[1]));
        System.out.printf("%d\n", Integer.parseInt(strNumArr[0])-Integer.parseInt(strNumArr[1]));
        System.out.printf("%d\n", Integer.parseInt(strNumArr[0])*Integer.parseInt(strNumArr[1]));
        System.out.printf("%d\n", Integer.parseInt(strNumArr[0])/Integer.parseInt(strNumArr[1]));
        System.out.printf("%d\n", Integer.parseInt(strNumArr[0])%Integer.parseInt(strNumArr[1]));
        System.out.printf("%.2f\n", Float.parseFloat(strNumArr[0])/Float.parseFloat(strNumArr[1]));
    }
}
