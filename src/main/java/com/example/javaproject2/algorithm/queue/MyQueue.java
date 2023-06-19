package com.example.javaproject2.algorithm.queue;

public class MyQueue {

    private final int[] arr = new int[4];

    //Queue에서 데이터 꺼내는 위치
    private int front = -1;

    //Queue에서 데이터를 추가하는 위치
    private int rear = -1;

    public MyQueue(){}

    //데이터 추가
    public void enQueue(int x){
        // rear + 1 이 배열의 크기만해질 때
        if(rear == arr.length - 1){
            throw new RuntimeException("queue is full");
        }
        //arr[rear]에 data 담기
        arr[++rear] = x;
    }

    //데이터 회수
    public int deQueue(){
        // front == rear 일 때 -> 큐가 비어있을 때 pop할 수 없음.
        if(front == rear){
            throw new RuntimeException("queue is empty");
        }

        rear--;
        //arr[front] 반환
        return arr[++front];

    }

    //큐가 비어있는지 확인하기
    public boolean isEmpty(){
        return front == rear;
    }

    //다음에 나올 데이터가 무엇인지 확인(queue에서 데이터 회수 하지 않음.)
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("queue is Empty");
        }

        return arr[front];
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
       q.enQueue(5);
       q.enQueue(6);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }

}
