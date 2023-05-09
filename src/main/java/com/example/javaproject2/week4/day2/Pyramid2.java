package com.example.javaproject2.week4.day2;

public class Pyramid2 {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", " ".repeat(height - i -1 ), "*".repeat(2 * i +1));
        }
    }
}
