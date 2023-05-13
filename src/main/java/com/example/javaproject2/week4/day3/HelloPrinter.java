package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class HelloPrinter {

    private Printer2 print1 ;

    public HelloPrinter(Printer2 print1) {
        this.print1 = print1;
    }
    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            print1.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
//        HelloPrinter hp = new HelloPrinter(new ConsolePrinter());
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(2,"hello");
    }

}
