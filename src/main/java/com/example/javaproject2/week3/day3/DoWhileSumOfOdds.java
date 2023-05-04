package com.example.javaproject2.week3.day3;

public class DoWhileSumOfOdds {
    public static void main(String[] args) {
        int answer = 0;
        int n = 10;

        do{
            if(n % 2 !=0)
            answer+= n;
        }while ( n-- != 0);

        System.out.println(answer);
    }
}
