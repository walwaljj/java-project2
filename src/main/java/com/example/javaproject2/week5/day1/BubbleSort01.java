package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort01 {
    int a = 3;

    public BubbleSort01() {

        this.a = 5;
    }

    public static void main(String[] args) {
        BubbleSort01 bs1 = new BubbleSort01();
        bs1.a = 2;
        System.out.println(bs1.a);

        int[] arr = {7,2,3,9,28,11,1};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        // 7과 9가 이미 순서대로 되었지만 아래 로직으로 인해 9, 7이 됨. -> 조건문을 걸어야한다.
        if(arr[2] > arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp2 = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp2;
//                }
//            }
//        }
//        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp2;
                }
//            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
