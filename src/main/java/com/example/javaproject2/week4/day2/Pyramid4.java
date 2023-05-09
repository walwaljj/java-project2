package com.example.javaproject2.week4.day2;

public class Pyramid4 {
    public void makePyramid(int height, String inputChar){
        for (int i = 0; i < height; i++) {
            System.out.printf(makeALine(height,i, inputChar));
        }
    }
    public String makeALine(int height, int i, String inputChar){
        return String.format("%s%s\n", inputChar.repeat(height - i -1 ), "*".repeat(2 * i +1));
    }
    public Pyramid4(int height, String inputChar ){
        makePyramid(height, inputChar);
    }

    public static void main(String[] args) {
        Pyramid4 pyramid = new Pyramid4(4, " ");

    }
}
