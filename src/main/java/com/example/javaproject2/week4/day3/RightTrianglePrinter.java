package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class RightTrianglePrinter extends ShapeDrawer2{

    //    private Printer printer = new PrintToFile();
    private Printer printer;
    public RightTrianglePrinter(Printer2 printer) {
        super(printer);
    }
    public String makeALine(int h, int i){
        return String.format("%s%s"," ","*".repeat(i));
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new ConsolePrinter());
        rtp.printShape(5);
    }
}
