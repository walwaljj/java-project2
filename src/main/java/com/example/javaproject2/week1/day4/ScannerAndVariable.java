package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt(); // scanner.nextInt(); 로 초기화 되기 전에는 메모리에 올라가지 않음.
        int iVal2 = scanner.nextInt();
        System.out.printf("%d 와 %d 의 합은 ? %d", iVal1, iVal2, iVal1 + iVal2);
    }
}
