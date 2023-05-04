package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;

        do{

            System.out.print("짝수 입력하세요\n");
            input = sc.nextInt();
        }while (input % 2 !=0);

        System.out.printf("%d 는 짝수입니다.\n",input);
    }
}
