package com.example.javaproject2.algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixToPostfixCalculation {

    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String input = reader.readLine();
        
        //결과를 담아둘 StringBuilder
        StringBuilder sb = new StringBuilder();

        //연산자를 담는 스택 
        Stack<Character> operStack = new Stack<>();

        //문자 단위로 순회
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);
            if (isOperator(token)) {
                if(operStack.empty()){
                    operStack.push(token);
                }

                else{
                    while (inStackPriority(operStack.peek()) >= inComingPriority(token)){
                        sb.append(operStack.pop());
                        if(operStack.empty()) break;
                    }

                    operStack.push(token);
                }
            }
            //닫는 괄호 일 때
            else if (token ==')') {
                Character top = operStack.pop();
                while (top != '('){
                    sb.append(top);
                    top = operStack.pop();
                }

            }
            //숫자의 경우 바로 출력
            else sb.append(token);

        }

        //연산자 스텍이 빌 때 까지 pop
        while (!operStack.empty()){
            sb.append(operStack.pop());
        }
        System.out.println(sb);
    }

    private static boolean isOperator(char token) {
        return token == '+' || token == '-' || token == '*' || token == '/' || token == '(';
    }

    private int inStackPriority(char operator){
        if(operator == '+' || operator == '-') return 1;
        else if (operator == '*' || operator == '/') return 2;
        else if (operator == '(') return 0;
        else throw new IllegalArgumentException("not allowed operator");
    }
    private int inComingPriority(char operator){
        if(operator == '+' || operator == '-') return 1;
        else if (operator == '*' || operator == '/') return 2;
        else if (operator == '(') return 3;
        else throw new IllegalArgumentException("not allowed operator");
    }

    public static void main(String[] args) throws IOException {
        new InfixToPostfixCalculation().solution();
    }
}
