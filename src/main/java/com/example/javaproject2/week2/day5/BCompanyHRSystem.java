package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp = sc.nextInt();
        int numOfProject = sc.nextInt();
        if(exp > 5 || numOfProject > 10){
            System.out.println("팀장 승진 대상입니다.");
        }else{
            System.out.println("팀장 승진 대상이 아닙니다.");
        }

    }
}
