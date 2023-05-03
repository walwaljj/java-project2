package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(num <= sum){
                break;
            }
            sum +=  i;
        }
        System.out.println(sum);
    }
}
