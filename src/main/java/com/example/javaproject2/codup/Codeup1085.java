package com.example.javaproject2.codup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();//48000이하
        float b = sc.nextFloat();//32이하, 8의 배수
        float c = sc.nextFloat();//5이하
        float s = sc.nextFloat();//6000이하 자연수
        //필요한 저장 공간을 MB단위로 바꿔 출력하기
        //소수점 둘 째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력
        System.out.printf("%.01f MB\n",((h * b * c * s) /1024f)/8f/1024f);
        ;
    }
}
