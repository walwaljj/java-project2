package com.example.javaproject2.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(is);

        System.out.println("buffered1.readLine() = "+buffer.readLine());
        System.out.println("buffered2.readLine() "+buffer.readLine());


    }

    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(is);
        System.out.println(buffer.readLine() + buffer.readLine());

    }
}
