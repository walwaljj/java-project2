package com.example.javaproject2.week3.day1;

public class ForLoopChar {

    public static void main(String[] args) {

        for (char i = 'a'; i < 'g' ; i++) {
            System.out.println(i);
        }

        System.out.println("===");
        for (int i = 'a'; i < 'g' ; i++) {
            System.out.printf("[ %d : %c ]\n", i, i);
        }

        System.out.println("===");
        for (int i = '가'; i < '갇' ; i++) {
            System.out.printf("[ %d : %c ]\n", i, i);
        }
    }
}
