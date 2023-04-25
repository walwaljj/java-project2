package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strNumArr = sc.nextLine().split("\\.");
        System.out.printf("%02d-%02d-%04d"
                ,Integer.parseInt(strNumArr[2])
                ,Integer.parseInt(strNumArr[1])
                ,Integer.parseInt(strNumArr[0]));

    }
}
