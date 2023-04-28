package com.example.javaproject2.week2.day5;

public class ElseExam {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18;
        if(isAdult) {
            System.out.println("성인입니다.");
        }else{
            System.out.println("미성년자입니다.");
        }

        boolean check = true;

        if(check){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
