package com.example.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {


        while(1 ==1){
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}
