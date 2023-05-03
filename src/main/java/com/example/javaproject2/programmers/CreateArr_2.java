package com.example.javaproject2.programmers;

import java.util.Arrays;

public class CreateArr_2 {
    public static void main(String[] args) {
        CreateArr_2 arr = new CreateArr_2();
        int l = 5;
        int r = 555;

        arr.solution(5,555);
    }

    public int[] solution(int l, int r) {
        int[] answer = new int[r-l+1];  // 결과 배열 선언
        int idx = 0;  // 결과 배열에 추가할 인덱스
        System.out.println(answer.length);
        for (int i = l; i <= r; i++) {
            if (isOnly05(i)) { // isOnly05 의 리턴값은 true 나 false임.
                answer[idx++] = i;  // 결과 배열에 추가
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(Arrays.copyOf(answer, idx)));
        if (idx == 0) {
            return new int[] {-1};  // 결과가 없는 경우 -1 반환
        } else {
            Arrays.sort(answer, 0, idx);  // 오름차순으로 정렬
            return Arrays.copyOf(answer, idx);  // 결과 배열 반환
        }
    }

    private boolean isOnly05(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
