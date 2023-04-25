package com.example.javaproject2.codup;


import java.util.Scanner;

public class Codeup1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNumArr = sc.nextLine().split(" ");
        System.out.printf("%d",Integer.parseInt(strNumArr[0]) % Integer.parseInt(strNumArr[1]));
    }
}
