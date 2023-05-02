package com.example.javaproject2.week3.day2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WhileFactorial {
    public static void main(String[] args) {
        int cnt = 5;
        int result = 1;
        while (cnt > 0){
            result *= cnt;
            System.out.println(result);
            cnt--;

        }
    }
}
