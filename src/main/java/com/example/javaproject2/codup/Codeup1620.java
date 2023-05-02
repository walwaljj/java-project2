package com.example.javaproject2.codup;

import java.io.*;
public class Codeup1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        while (num !=0){
            int i = num % 10;
            sum += i ;
            num /= 10;
            if( num == 0 && sum > 9 ){
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
