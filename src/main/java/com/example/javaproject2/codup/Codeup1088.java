package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";
        for (int i = 1; i <= num; i++) {
            str += i % 3 != 0 ?  i + " " : "" ;
        }
        System.out.println(str);
    }
}
