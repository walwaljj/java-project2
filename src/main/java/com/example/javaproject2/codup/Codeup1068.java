package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90) {
            System.out.println("A");
        }
        else if(score >= 70) {
            System.out.println("B");
        }else if(score >= 40) {
            System.out.println("C");
        }else if(score >= 0) {
            System.out.println("D");
        }

    }
}
