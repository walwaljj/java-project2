package com.example.javaproject2.codup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] rgb = sc.nextLine().split(" ");
        int count = 0;
        for (int i = 0; i < Integer.parseInt(rgb[0]); i++) {
            for (int j = 0; j < Integer.parseInt(rgb[1]); j++) {
                for (int k = 0; k < Integer.parseInt(rgb[2]); k++) {
                    count ++;
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.flush();
        System.out.println(count);
    }
}
