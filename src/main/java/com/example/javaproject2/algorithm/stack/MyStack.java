package com.example.javaproject2.algorithm.stack;

public class MyStack {

    private final int[] arr = new int[16];

    private int top = -1;

    public MyStack(){}

    public boolean empty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public int size(){
        if(empty()){
            throw new RuntimeException("stack is full");
        }
        return top + 1;
    }

    public void push(int data){
        if(arr.length - 1 == top){
            throw new RuntimeException("stack is full");
        }
        arr[++top] = data;
    }

    public int pop(){
        if(empty()){
            throw new RuntimeException("stack is empty");
        }
        return arr[top--];
    }

    public int peek(){
        if(empty()) throw new RuntimeException("stack is empty");
        return arr[top];
    }

    public static void main(String[] args) {
        MyStack intStack = new MyStack();

        intStack.push(3);
        intStack.push(5);
        intStack.push(7);

//        System.out.println(intStack.top);
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
        System.out.println(intStack.empty());
        System.out.println(intStack.size());

    }
}
