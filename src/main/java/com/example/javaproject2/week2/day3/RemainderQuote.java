package com.example.javaproject2.week2.day3;

public class RemainderQuote {
    public static void main(String[] args) {
        int iVal = 1;

        //몫
        System.out.println(iVal / 2); //0
        //나머지
        System.out.println(iVal / 2); //0
        // 결론 : float이 아니기 때문에 소수점이하를 버리게 된다.

        int quote =  10 / 3;
        int remain = 10 % 3;
        System.out.printf("10과 3을 나눈 몫은 %d 이고 나머지는 %d 입니다.",quote, remain);

    }
}
