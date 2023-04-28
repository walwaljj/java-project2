package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numArr = sc.nextLine().split(" ");

        for(int i = 0; i < numArr.length ; i ++){
            if( Integer.parseInt(numArr[i]) % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }

    }
}
