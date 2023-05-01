package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        for (char i = 'a'; i <= ch ; i++) {
            System.out.print(i+" ");
        }
    }
}
