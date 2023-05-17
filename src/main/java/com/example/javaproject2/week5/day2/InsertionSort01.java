package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};

//        for (int i = 1 ; i < arr.length; i++){
//            for (int j = i; j > 0; j--) {
//                if(arr[j-1] > arr[i] ){
//                    int temp = arr[i];
//                    arr[i]  = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }

//        for (int i = 1 ; i < arr.length; i++){
//            for (int j = i; j > 0; j--) {
//                if(arr[j-1] > arr[j] ){
//                    int temp = arr[j];
//                    arr[j]  = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }


        /*튜닝
         * 교환을 하지 못하면 break를 건다.
         *
         * */
        for (int i = 1 ; i < arr.length; i++){
            for (int j = i; j > 0; j--) {
                if(arr[j-1] > arr[j] ){
                    int temp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
