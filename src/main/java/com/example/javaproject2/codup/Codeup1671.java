package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Codeup1671 code = new Codeup1671();
        System.out.println(code.result(sc.nextInt(), sc.nextInt()));

    }

    public String result(int kwanghyeon, int comp) {
        String str = "";
        if (kwanghyeon == 0 && comp == 1 || kwanghyeon == 1 && comp == 2 || kwanghyeon == 2 && comp == 0) {
            str = "win";
        } else if (kwanghyeon == comp) {
            str = "tie";
        } else {
            str = "lose";
        }
        return str;
    }

}
