package com.example.javaproject2.week7.day1;

public class Game {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i+" "+getString(i));

        }
    }

    private static String getString(int i) {
        String str = "";
        if ((i % 10) % 3 == 0 && i != 0){
            str += "*";
        }
        if((i / 10) % 3 == 0 && i > 10){
            str += "*";
        }
        return str;
    }

}
