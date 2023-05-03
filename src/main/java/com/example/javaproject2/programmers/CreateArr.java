package com.example.javaproject2.programmers;

public class CreateArr {
    public static void main(String[] args) {
        CreateArr arr = new CreateArr();
        int l = 5;
        int r = 555;

        arr.solution(5,555);
    }

    public int[] solution(int l, int r) {
        int count = 0;
        int fiveNZero = 0;
        for(int i = 1; i < r; i++){
            String str = Integer.toBinaryString(i);
            if( l <= Integer.parseInt(str)*5 && r >= Integer.parseInt(str)*5 ){
                count ++;
            }
        }
        if (count == 0){
            return new int[]{-1};
        }

        int[] answer = new int[count];

        for(int i = 1 ; i <= count ; i ++){
            for (int j = 1; j <= r; j++) {
                String str = Integer.toBinaryString(i);
                if( l <= Integer.parseInt(str)*5 && r >= Integer.parseInt(str)*5){
                    fiveNZero = Integer.parseInt(str)*5;
                    break;
                }
            }
            answer[i-1] = fiveNZero;
        }
        return answer;
    }
}
