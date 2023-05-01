package com.example.javaproject2.programmers;

public class dicegame2 {
    public static void main(String[] args) {

        dicegame2 game = new dicegame2();
        game.solution(5, 3, 3);
    }

    public int solution(int a, int b, int c) {
        int answer = 1;
        int count = 0;
        int[] numArr = {a, b, c};
        for(int i = 0; i < numArr.length-1 ; i++){
            for(int j = numArr.length-1; j > 1 ; j--){
                if(numArr[i] == numArr[j]){
                    count ++;
                }
            }
        }
        for (int i = 1; i <= count+1; i++) {
            answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
        }
        return answer;
    }
}
