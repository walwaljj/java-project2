package com.example.javaproject2.week4.day2;

public class Parallelogram {

    private  String spaceChar = "0";

    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private  void printReversePyramid(int height) {

        for (int i = 0 ; i < height; i++) {
            System.out.printf(makeALine(i, height));
        }
    }

    public  String makeALine(int i , int height){
        return String.format("%s%s\n",spaceChar.repeat(i),"*".repeat(height));
    }

    public static void main(String[] args) {
        Parallelogram rp = new Parallelogram(" ");

        rp.printReversePyramid(5);
    }

}
