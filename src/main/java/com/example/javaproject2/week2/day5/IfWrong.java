package com.example.javaproject2.week2.day5;

public class IfWrong {
    public static void main(String[] args) {
        int score = 81;
        if(score >= 90){
            System.out.println("A");
        }if(score >= 80){
            System.out.println("B"); // "B" 출력됨
        }if(score >= 70){ // if문 이기 때문에 조건문이 실행됨.
            System.out.println("C"); // "C" 출력
        }


        int score2 = 75;
        if (score2 >= 90) {
            System.out.println("A");
        } else {
            if (score2 >= 80) {
                System.out.println("B");
            } else {
                if (score2 >= 70) {
                    System.out.println("C");
                } else {
                    System.out.println("F");
                }
            }
        }
    }
}
