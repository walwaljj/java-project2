package com.example.javaproject2.week3.day3;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 545;
        System.out.println(extracted(num));

    }

    private static String extracted(int num) {
        String info = " 0또는 5만 있는 숫자";
        boolean isZeroOrFive = false;
        while (num !=0){
            int i = num % 10;
            if(i != 0 && i != 5 ){
                info = " 0과 5이외에 다른 숫자가 있음";
                return false + info;
            }else{
                num /= 10;
            }
        }return true  + info;
    }
}
