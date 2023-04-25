package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strNumArr = sc.nextLine().split(" ");
        long num1 = Long.parseLong(strNumArr[0]);
        long num2 = Long.parseLong(strNumArr[1]);
        System.out.println(num1 + num2);
    }
}
