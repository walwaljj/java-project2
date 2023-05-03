package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1072_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
