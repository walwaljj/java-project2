package com.example.javaproject2.algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParTest2 {

    static public boolean solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            // 문자열을 순회
            char ch = input.charAt(i);

            //ch가 '(' ,  '{' , '[' 와 같이 여는 괄호라면 stack 에 push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            //ch가 ')' ,  '}' , ']' 와 같이 닫는 괄호일 때
            else if (ch == ')' || ch == '}' || ch == ']') {
                // 만약 stack 이 비어있으면 false 를 return
                if(stack.empty()) return false;
                // stack 에서 가장 위에 있는 요소를 꺼내 top 에 담음.
                char top = stack.pop();

                // 여는 괄호와 닫는괄호 쌍이 맞지 않으면 false 를 return
                if(ch ==')' && top != '(') return false;
                else if(ch =='}' && top != '{') return false;
                else if(ch ==']' && top != '[') return false;
            }

//            // ch가  ')' 일 때
//            else if (ch == ')') {
//                // stack 이 비어있거나 최상단이 '(' 아니면 올바르지 않은괄호
//                if (stack.isEmpty() || stack.peek() != '(') {
//                    return false;
//                }
//                // 맞는괄호라면 stack 에서 '(' 를 pop
//                stack.pop();
//            }
//            // ch가  '}' 일 때
//            else if (ch == '}') {
//                // stack 이 비어있거나 최상단이 '{' 아니면 올바르지 않은괄호
//                if (stack.isEmpty() || stack.peek() != '{') {
//                    return false;
//                }
//                // 맞는괄호라면 stack 에서 '{' 를 pop
//                stack.pop();
//            }
//            // ch가  ']' 일 때
//            else if (ch == ']') {
//                // stack 이 비어있거나 최상단이 '[' 아니면 올바르지 않은괄호
//                if (stack.isEmpty() || stack.peek() != '[') {
//                    return false;
//                }
//                // 맞는괄호라면 stack 에서 '[' 를 pop
//                stack.pop();
//            }

        }
        // stack이 모두 비어있다면 true를 return
        return stack.empty();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(solution());
        /**
         * ({{()(){}{}{}}}) // true;
         * {{()(){}{}{}}}) // false;
         * [{((){}[])}]{}() //true;
         */
    }

}
