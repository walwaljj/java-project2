package com.example.javaproject2.programmers;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brackets = "(((())))";

        while (brackets.indexOf("()") != -1) {
            String[] split = brackets.split("\\(\\)");
            brackets = String.join("", split);
        }

    }
}
