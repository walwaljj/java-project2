package com.example.javaproject2.week4.day2;

public class PyramidShapeDrawer extends ShapeDrawer{

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n"," ".repeat(i),"*".repeat(2 * (h - i) - 1));
    }
}
