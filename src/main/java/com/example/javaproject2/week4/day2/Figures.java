package com.example.javaproject2.week4.day2;

public class Figures {
    public static void main(String[] args) {

        diEx de = new diEx(new MinNum());
        diEx de2 = new diEx(new MaxNum());
        int[] arr = {1, 2, 3, 4, 5};
        System.out.printf("min : %d max : %d\n",de.returnVal(arr) , de2.returnVal(arr) );

    }
}

class diEx {
    private IsMinOrMax isMinOrMax;

    public diEx(IsMinOrMax isMinOrMax){

        this.isMinOrMax = isMinOrMax;
    }

    public int returnVal(int[] arr){

        return isMinOrMax.result(arr);
    }
}

