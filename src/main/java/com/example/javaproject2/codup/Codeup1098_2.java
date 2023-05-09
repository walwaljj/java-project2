package com.example.javaproject2.codup;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Codeup1098_2 {

    private int[][] arr;
    public boolean printSeperate;

    public Codeup1098_2(){
        this.arr = new int[5][5];
    }
    public Codeup1098_2(boolean printSeparator){
        this.arr = new int [5][5];
        this.printSeperate = printSeparator;
    }
    public Codeup1098_2(int row, int col){
       this.arr = new int [row][col];

    }

    public void setBeam(int l , int direction, int x, int y){
        for (int i = 0; i < l; i++) {
            if (direction == 0){
                arr[x - 1][y + i - 1] = 1;
            }else {
                arr[x + i- 1][y - 1] = 1;
            }
        }
    }

    public void print() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++) {
            bw.write(Arrays.toString(arr[i])+"\n");
        }
        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Codeup1098_2 code = new Codeup1098_2(sc.nextInt(),sc.nextInt());

        code.setBeam(2, 0, 1, 1);
        code.print();
        code.setBeam(3, 1, 2, 3);
        code.print();
        code.setBeam(4, 1, 2, 5);
        code.print();

    }
}
