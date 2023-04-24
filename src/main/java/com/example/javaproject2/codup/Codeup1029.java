package com.example.javaproject2.codup;

import java.math.BigDecimal;
import java.util.Scanner;

public class Codeup1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num = sc.nextDouble();
        System.out.printf("%.11f",num);// .11d 는 안됨.
    }
}
