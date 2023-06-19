package com.example.javaproject2.algorithm.string;

public class AlphaToInteger {

    public int aroi(String value){
        int result = 0;
        int i = 0;
        if(value.charAt(i) == '-') {
            i ++;
            result *= -1;
        }
        for (; i < value.length(); i++) {
            char ch = value.charAt(i);
            result *= 10;

            result += ch - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        AlphaToInteger atoi = new AlphaToInteger();
        System.out.println(atoi.aroi("12345"));
        System.out.println(atoi.aroi("-4291"));
    }

}
