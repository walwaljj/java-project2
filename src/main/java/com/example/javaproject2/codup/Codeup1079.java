package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        for (int i = 0; i < str.length ; i++) {
            System.out.println(str[i]);
            if(str[i].equals("q")){
                break;
            }
        }
    }
}
