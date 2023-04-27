package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNum = sc.nextLine().split(" "); // 공백으로 구분된 두 수를 배열에 담음
        System.out.printf("%d",Integer.parseInt(strNum[0])^Integer.parseInt(strNum[1]));
        // 0번, 1번째 인덱스를 int로 변환 후 비트연산
        // 실행 시 3 5 가 입력되면
        // 3^5 연산의 결과가 %d 를 통해 10진수로 변환된다. 즉, 6이 나옴.
        //입력 (10진수 입력 후 ^ 연산자를 통해 2진수로 변환됨.)
        // 0011 -> 0 + 0 + 2 + 1 = 3
        // 0101 -> 0 + 4 + 0 + 1 = 5
        //결과 (비트를 비교해 두 수가 다르면 1이 됨.)
        // 0110 -> 0 + 4 + 2 + 0 = 6
    }
}
