package com.example.javaproject2.week4.day3;

import com.example.javaproject2.week4.day2.ShapeDrawer;

public class Diamond {
    public static void main(String[] args) {
        ShapeDrawer sd = new DiamondDrawer();
        int h = 7;
        sd.printPyramid(h);
    }
}
