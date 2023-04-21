package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArrays = (sc.next().split("\\."));
        System.out.printf("%04d.%02d.%02d",Integer.parseInt(strArrays[0]),
                Integer.parseInt(strArrays[1]),
                Integer.parseInt(strArrays[2]));
    }
}
