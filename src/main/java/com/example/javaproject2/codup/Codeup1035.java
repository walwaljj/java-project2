package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strOctal = sc.next();
        int octal = Integer.parseInt(strOctal, 16);
        System.out.printf("%o",octal);

    }
}
