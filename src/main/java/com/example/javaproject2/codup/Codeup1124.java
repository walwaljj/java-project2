package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] formula = sc.nextLine().split("H");
        String[] cs = formula[0].split("C");
        System.out.println((Integer.parseInt(cs[1])) * 12 + (Integer.parseInt(formula[1])));


    }
}

