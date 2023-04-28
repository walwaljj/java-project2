package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class IfWithLogicalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if(x > 0 && y > 0){
            System.out.println("x와 y 는 모두 양수 입니다.");
        }
        if(x > 0 || y > 0){
            System.out.println("x 또는 y 중 하나 이상이 양수 입니다.");
        }
        if(!(x > 0)){// (x 가 0보다 크다) 를 ! 를 이용해 부정을 만듦.
                        //if 문을 이용해 위 내용일 때 true로 블록내 출력문을 수행하도록 함.
            System.out.println("x는 음수 또는 0 입니다.");
        }
        
    }
}
