package com.example.javaproject2.programmers;

import java.util.Arrays;
import java.util.Collections;
public class HallOfFrame {
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        HallOfFrame hallOfFrame = new HallOfFrame();

        System.out.println(Arrays.toString(hallOfFrame.solution(3, score)));
        System.out.println(Arrays.toString(score));
    }

    public int[] solution(int k, int[] score) {
        Integer[] daily = {};
        int count = 0;
        int[] answer = new int [score.length];
        for(int i = 0 ; i < score.length; i ++){
            count ++;
            daily = new Integer[count];
            for(int j = 0 ; j < count; j++){
                daily[j] = score[j];
            }
            if(k < daily.length) {
                Arrays.sort(daily, Collections.reverseOrder());
                answer[i] = daily[k-1];
            }else{
                Arrays.sort(daily);
                answer[i] = daily[0];
            }
        }
        return answer;
    }
}
