package com.example.javaproject2.week2.day4;

public class BoilerController {
    public static void main(String[] args) {
        int waterTemperature = 45;
        int roomTemperature = 22;

        boolean check = waterTemperature < 50 && roomTemperature < 24;

        System.out.printf("check: %b\n",check);

    }
}
