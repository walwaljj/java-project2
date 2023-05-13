package com.example.javaproject2.week4.day3;

import java.io.IOException;

public abstract class ShapeDrawer2{

    public Printer2 printer;

    public ShapeDrawer2(Printer2 printer) {
        this.printer = printer;
    }

    public abstract String makeALine(int h, int i);

    public void printShape(int h) throws IOException {
        for (int i = 1; i <= h; i++) {
            printer.print(makeALine(h, i));
        }
    }
}
