package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort02 {
    public int[] sort(int[] arr){
        for (int i = 1 ; i < arr.length; i++){
            for (int j = i; j > 0; j--) {
                if(arr[j-1] > arr[j] ){
//              if(arr[j-1] - arr[j] > 0 ){  위 조건문과 같게 나옴.
                    int temp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        InsertionSort02 is = new InsertionSort02();
        System.out.println(Arrays.toString(is.sort(arr)));
    }

}
