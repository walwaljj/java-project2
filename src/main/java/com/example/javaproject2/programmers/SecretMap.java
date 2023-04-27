package com.example.javaproject2.programmers;

import java.util.Arrays;
public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String str;
        int binary = 0;
        for(int i = 0 ; i < n ; i ++){
            binary = arr1[i] | arr2[i];
            str = Integer.toBinaryString(binary).replace("1","#");
            for(int j = 0 ; j < n ; j ++){
                if(str.length() < n) {
                    str = " " + str;
                }
            }
            answer[i] = str.replace("0"," ");
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        int num = 6;
        int[] arr1 = new int[]{46, 33, 33, 22, 31, 50};
        int[]arr2 =	new int[]{27, 56, 19, 14, 14, 10};

    }

}
