package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNum = sc.nextLine().split(" ");
        System.out.printf("%d",Integer.parseInt(strNum[0]) < Integer.parseInt(strNum[1])
                ? Integer.parseInt(strNum[1]) : Integer.parseInt(strNum[0]));
    }
}
