package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort03 {
    public int[] sort(int[] arr, boolean isAsending){
        for (int i = 1 ; i < arr.length; i++){
            for (int j = i; j > 0; j--) {
                if((isAsending ? arr[j-1] - arr[j] : arr[j] - arr[j-1]) > 0 ){
                    int temp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }return arr;
    }
    public int[] sort(int[] arr){
        return sort(arr,true); // 오버로딩일 때 는 로직을 옮기고 호출해주기
    }
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        InsertionSort03 is = new InsertionSort03();
        System.out.println(Arrays.toString(is.sort(arr)));
    }

}
