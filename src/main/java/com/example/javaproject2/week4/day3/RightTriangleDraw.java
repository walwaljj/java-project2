package com.example.javaproject2.week4.day3;


import java.io.IOException;

public class RightTriangleDraw extends ShapeDrawer2 {
    public RightTriangleDraw(Printer2 printer) {
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s", " ".repeat(h - i),"*".repeat(i * 2 -1));
    }
    public static void main(String[] args) throws IOException {

        ShapeDrawer2 sd1 = new RightTriangleDraw(new FilePrinter());
        int height1 = 5;
        sd1.printShape(height1);

        RightTriangleDraw sd2 = new RightTriangleDraw(new ConsolePrinter());
        int height2 = 3;
        sd2.printShape(height2);
    }

}

