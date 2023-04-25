package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strOctal = sc.next();
        int octal = Integer.parseInt(strOctal, 8);
        System.out.printf("%d",octal);

    }
}
