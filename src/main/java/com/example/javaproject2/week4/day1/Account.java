package com.example.javaproject2.week4.day1;

public class Account {
    int balance = 1000;
    public void printIsSufficient(){
        System.out.println("잔액이 충분합니다.");
    }
    public boolean isSufficient(){
        return balance >=1500;
    }

}
