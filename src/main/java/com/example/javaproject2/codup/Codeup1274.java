package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "prime";
        for (int i = 2 ; i < num / 2 ; i++) {
            if(num % i == 0){
               str = "not " + str;
                break;
            }

        }
        System.out.println(str);

    }
}
