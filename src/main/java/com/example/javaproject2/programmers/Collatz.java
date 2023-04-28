package com.example.javaproject2.programmers;

import java.math.BigInteger;

public class Collatz {
    public static void main(String[] args) {
        long num = 626331;
        Collatz collatz = new Collatz();
        System.out.println(collatz.solution(num));
    }
    public int solution(long num) {
        int answer = 0;
        if(num == 1){
            return 0;
        }

        while ( num != 1 ){

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
        }

        if(answer > 500){
            return -1;
        }
        return answer ;
    }

}
