package com.example.javaproject2.week7.opgame.service;


public interface IOperator {
    void setA(int a);
    void setB(int b);
    void generateQuestion(int max);
    String getQuestionMsg();
    boolean isEquals(int answer);
}

