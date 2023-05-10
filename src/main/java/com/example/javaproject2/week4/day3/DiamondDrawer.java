package com.example.javaproject2.week4.day3;

import com.example.javaproject2.week4.day2.ShapeDrawer;

public class DiamondDrawer extends ShapeDrawer {
    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int h, int i) {
        if(i <= h/2){
            return String.format("%s%s\n", getRepeatedSymbol(" ",-4 + h - i), getRepeatedSymbol("*",2 * i + 1));
        }else {
            return String.format("%s%s\n",getRepeatedSymbol(" ",i - h/2 ), getRepeatedSymbol("*",2 * (h - i) - 1));
        }
    }
}
