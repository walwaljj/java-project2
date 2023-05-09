package com.example.javaproject2.week4.day2;

public class MultiplicationTable {

    String multipleSymbol = "x";
    public MultiplicationTable(String multipleSymbol){
        this.multipleSymbol = multipleSymbol;
    }
    public void printDan(int dan){
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable mt1 = new MultiplicationTable("x");

        mt1.printDan(2);

        MultiplicationTable mt2 = new MultiplicationTable("*");

        mt2.printDan(2);


    }

}
