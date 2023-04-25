package com.example.javaproject2.codup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int readNum = br.read() + 1;
        char ch = (char) readNum;
        System.out.printf("%s",ch);
    }
}
