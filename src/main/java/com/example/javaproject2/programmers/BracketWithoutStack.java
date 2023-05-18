package com.example.javaproject2.programmers;

public class BracketWithoutStack {
    public static void main(String[] args) {
        String brackets = "(((())))";
        while (brackets.indexOf("()")!= -1){
            brackets = brackets.replace("()","");
        }
        boolean b = brackets.length() == 0;
        System.out.println(b);
    }
}
