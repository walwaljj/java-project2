package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {

    //값을 넣을 메모리 공간
    private int[] arr = new int[10000];
    private int pointer = 0;

    // 값을 넣음. , 리턴값없음 void
    public void push(int value){
        this.arr[pointer++] = value; // arr 에 값을 넣고 pointer를 ++ 함.
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer = " + pointer);
    }

    public int pop(){
//        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        if(isEmpty()) throw new EmptyStackException();

        return this.arr[--pointer];
    }

    public boolean isEmpty(){
        return this.pointer == 0;
    }

    public int peek(){
//        if(isEmpty()) throw new EmptyStackException();
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer -1];
    }


    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        st.push(20);

        System.out.println(st.pop());
        System.out.println(st.pop());

        System.out.println(st.isEmpty());
        System.out.println(st.peek());
    }
}
