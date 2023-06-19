package com.example.javaproject2.algorithm.string;

public class IntegerToAlpha {
    public String itoa(int value){
        StringBuilder sb = new StringBuilder();

        boolean negative = false;
        if(value < 0){
            negative = true;
            value *= -1;
        }
        while (value != 0){
            char ch = (char)(value % 10 + '0') ;
            sb.append(ch);
            value /= 10;
        }
        if(negative){ sb.append('-');}

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha itoa = new IntegerToAlpha();

        System.out.println(itoa.itoa(-1234) + itoa.itoa(-56789));
    }
}
