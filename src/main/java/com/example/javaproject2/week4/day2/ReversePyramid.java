package com.example.javaproject2.week4.day2;

public class ReversePyramid {

    private  String spaceChar = "0";

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private  void printReversePyramid(int height) {

        for (int i = 0 ; i < height; i++) {
            System.out.printf(makeALine(i, height));
        }
    }

    public  String makeALine(int i , int height){
        return String.format("%s%s\n",spaceChar.repeat(i),"*".repeat(2 * (height - i) - 1));
    }

    public static void main(String[] args) {
        ReversePyramid rp = new ReversePyramid(" ");

        rp.printReversePyramid(5);
    }

}
