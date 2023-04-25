package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strNumArr = sc.nextLine().split("");
        for (String s : strNumArr) {
            System.out.println("'" + s + "'");
        }
    }
}
