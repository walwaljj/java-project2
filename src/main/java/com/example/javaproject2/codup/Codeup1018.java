package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = sc.next().split(":");
        String hour = strArray[0];
        String minute = strArray[1];
        System.out.printf("%s:%s",hour , minute);
    }
}
