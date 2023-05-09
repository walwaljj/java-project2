package com.example.javaproject2.week4.day2;

public class PrintStarUtils {
    public static String makePyramidLine(int height, int i){
        return String.format("%s%s\n"," ".repeat(i),"*".repeat(2 * (height - i) - 1));
    }
}
