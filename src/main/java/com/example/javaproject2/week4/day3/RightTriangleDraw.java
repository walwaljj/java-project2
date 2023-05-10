package com.example.javaproject2.week4.day3;

public class RightTriangleDraw extends ShapeDrawer{
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i),"*".repeat(i * 2 -1));
    }
    public static void main(String[] args) {
        ShapeDrawer sd = new RightTriangleDraw();
        int h = 5;
        sd.printShape(h);
    }

}
abstract class ShapeDrawer{
    public abstract String makeALine(int h, int i);

    public void printShape(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.print(makeALine(h, i));
        }
    }

}
