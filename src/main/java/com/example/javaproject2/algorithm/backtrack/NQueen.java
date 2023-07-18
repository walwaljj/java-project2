package com.example.javaproject2.algorithm.backtrack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
// 구현 방법
    // 1. int[][] 로 판을 모두 구현하는 방법

    // 2. 각 줄 어느 위치에 퀸이 존재하는지 기록하는 방법. 유망성 조사가 일어남.
    //- 유망성 조사 : 답이 될수 있는지 없는지를 판단

    private int[] queenPos; // 퀸 위치 기록용 배열

    private int size; // 입력될 값 N
    private int count; // 출력될 값

    public int solution() throws IOException{
        size = Integer.parseInt(
                new BufferedReader((
                        new InputStreamReader(System.in))
                ).readLine());

        queenPos = new int[size];
        count = 0;
        setQueenPos(0);
        return count;
    }

    // 퀸의 위치를 찾고, 퀸을 배치함
    private void setQueenPos(
            int row // 현재 퀸이 위치한 행
    )
    {
        if(row == size) count ++ ; // 모든 행에 배치 완료로 count 증가
        else{
            for (int i = 0; i < size; i++) {

                queenPos[row] = i; // 반복문을 순회하며 i번째 열에 퀸 배치

                if(checkQueen(row))
                    setQueenPos(row + 1); // true 일 때 다음 행 탐색
            }
        }

    }


    // 퀸이 만나는지 확인
    private boolean checkQueen(int row){

        for (int i = 0; i < row; i++) {
            // 같은 열에 위치하는지 확인
            if(queenPos[i] == queenPos[row])
                return false;
                // 대각선에 위치하는지 확인
            else if (Math.abs(queenPos[i] - queenPos[row]) == row - i)
                return false;
        }
        return true; // 유망함
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new NQueen().solution()); // 입력 : 8 , 출력 : 92
    }
}