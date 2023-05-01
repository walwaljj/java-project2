package com.example.javaproject2.programmers;

import java.util.List;

public class EvenNOdd {
    public static void main(String[] args) {
        EvenNOdd eno = new EvenNOdd();
        int[] num_list = {3, 4, 5, 2, 1};
        eno.solution(num_list);
    }
    public int solution(int[] num_list) {
        int answer = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = num_list.length-1; i >= 0 ; i--) {
            if(num_list[i] % 2 ==0){
                answer += num_list[i] * (int)Math.pow(10 , evenCount);
                evenCount ++;
            }else{
                answer += num_list[i] * (int)Math.pow(10 , oddCount);
                oddCount ++;
            }
        }
        return answer;
    }
}
