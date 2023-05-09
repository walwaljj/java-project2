package com.example.javaproject2.week4.day2;

import static org.junit.jupiter.api.Assertions.*;

class ShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer pl = new ParallelogramShapeDrawer();
        pl.printPyramid(4);
        ShapeDrawer pr = new PyramidShapeDrawer();
        pr.printPyramid(5);
    }


}