package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArrays = (sc.next().split("-"));
        System.out.printf("%s%s",strArrays[0],strArrays[1]);
    }
}
