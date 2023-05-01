package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1441_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howManyNum = sc.nextInt();
        int[] numArr = new int[howManyNum];

        for(int i = 0 ; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }
        if(howManyNum != 1){
            int temp = 0;
            for(int i = numArr.length-1 ; i > 0; i--){
                for(int j = 0 ; j < i ; j++){
                    if(numArr[j] > numArr[j+1]){
                        temp = numArr[j];
                        numArr[j] = numArr[j+1];
                        numArr[j+1] = temp;
                    }
                }

            }
            for (int num : numArr) {
                System.out.println(num);
            }
        }else{
            System.out.println(numArr[0]);
        }
    }
}
