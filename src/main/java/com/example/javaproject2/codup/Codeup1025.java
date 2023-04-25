package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strNumArr = sc.nextLine().split("");
        System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]\n"
                ,(Integer.parseInt(strNumArr[0])*10000)
                ,(Integer.parseInt(strNumArr[1])*1000)
                ,(Integer.parseInt(strNumArr[2])*100)
                ,(Integer.parseInt(strNumArr[3])*10)
                ,(Integer.parseInt(strNumArr[4])));
    }
}
