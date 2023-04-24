package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split("\\.");
        System.out.printf("%s\n%s",split[0],split[1]);

    }
}
