package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0;  ; i++) {
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            System.out.println(num);
        }
    }
}
