package com.example.javaproject2.week2.day1;

public class StringPlusInt {
    public static void main(String[] args) {
        System.out.println("1"+1); // 11 , 타입이 다름 암시적으로 String 으로 형변환이 일어난다.
        String str = 1 + "1";
        System.out.println(str);
    }
}
