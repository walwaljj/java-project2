package com.example.javaproject2.programmers;

public class FindPrimeNum {
    public static void main(String[] args) {
        FindPrimeNum fp = new FindPrimeNum();
        fp.solution("17");
    }

    public int solution(String numbers) {
        int answer = 0;
        String[] strNumArr = numbers.split("");
        for (int i = 0; i < strNumArr.length; i++) {
            System.out.println(strNumArr[i]);
        }
        return answer;
    }

}
