package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하시고 엔터를 입력하세요");
        System.out.print("첫 번째 숫자 : ");
        System.out.println( sc.nextInt() + "\n두 번째 숫자 :" + sc.nextInt());
    }
}
