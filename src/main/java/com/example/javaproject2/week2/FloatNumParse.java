package com.example.javaproject2.week2;

public class FloatNumParse {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);

        float v = Float.parseFloat(val1);
        System.out.println("v = " + v);
        int i = Integer.parseInt(val1);//에러
        System.out.println("i = " + i);



    }
}
