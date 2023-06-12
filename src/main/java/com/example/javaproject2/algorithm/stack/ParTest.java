package com.example.javaproject2.algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParTest {
    public boolean solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            if(next == '('){
                stack.push(next);
            }
            else if(next == ')'){
                if( stack.empty() )return false;
                if( stack.pop() != ')') return false;
            }
        }
        return stack.empty();
    }
}
