package com.example.javaproject2.algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixCalculation {
    public static void main(String[] args) throws IOException {
            new PostfixCalculation().solution();
    }

    public void solution() throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String input = reader.readLine();

        Stack<Integer> digitStack = new Stack<>();
        Integer num1 = 0;
        Integer num2 = 0;
        for (int i = 0; i < input.length(); i++) {

            char token = input.charAt(i);

            // 1. 숫자 -> push
//            if(token >= '0' && token <= '9') {
            if(Character.isDigit(token)) {
                digitStack.push(token - '0');

            // 2. 연산자 -> 숫자 2 개 pop 후 연산
            }else if(digitStack.size() > 1){
                num1 = digitStack.pop();
                num2 = digitStack.pop();
                if(token == '*') {
                    digitStack.push(num2 * num1 );
                }
                if(token == '+'){
                    digitStack.push(num2 + num1 );
                }
                if(token == '-'){
                    digitStack.push(num2 - num1 );
                }
                if(token == '/'){
                    digitStack.push(num2 / num1 );
                }
            }
        }
        if(digitStack.empty()){
            System.out.println("error");
        }else {
            System.out.println(digitStack.pop());
        }
    }
}
