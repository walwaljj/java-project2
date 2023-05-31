package com.example.javaproject2.week7.opgame.service;

public class OpGame {
    int remainingAnswers;
    int a, b;
    public void makeQuestion() {
        remainingAnswers = 3;
        a = 1;
        b = 1;
    }

    public String getQuestion() {
        return String.format("%d + %d = ",a,b);
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers --;
        return (a + b) == answer;
    }

    public String getCheeringMsg() {
        return "한번 더 해보자";
    }
}
