package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt(16);
        String num = sc.next();
        for (int i = 1; i <= 15 ; i++) {
            System.out.printf("%X*%X=%X\n",Integer.parseInt(num,16),i,Integer.parseInt(num,16)*i);
        }
    }
}
