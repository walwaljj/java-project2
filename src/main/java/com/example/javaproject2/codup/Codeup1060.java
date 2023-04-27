package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNum = sc.nextLine().split(" ");
        System.out.printf("%d",Integer.parseInt(strNum[0])&Integer.parseInt(strNum[1]));
    }
}
