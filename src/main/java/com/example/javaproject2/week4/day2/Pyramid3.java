package com.example.javaproject2.week4.day2;

public class Pyramid3 {
    public void makePyramid(int height){
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", " ".repeat(height - i -1 ), "*".repeat(2 * i +1));
        }
    }
    public  Pyramid3(int height){
        makePyramid(height);
    }

    public static void main(String[] args) {
        Pyramid3 pyramid = new Pyramid3(4);

    }
}
