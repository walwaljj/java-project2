package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class PrintToConsole implements Printer{
    @Override
    public void print(String[] lines) throws IOException {
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }
}
