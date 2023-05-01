package com.example.javaproject2.week3.day1;

public class MultiplicationTable2 {

    public static void main(String[] args) {

        printDan(3);
    }

    private static void printDan(int dan) {
        for (int j = 1; j <= 9; j ++ ) {
            System.out.printf("%d * %d = %d\n", dan, j , dan * j);
        }System.out.println("-----");
    }
}
