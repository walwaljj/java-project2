package com.example.javaproject2.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // enqueue
        // queue 가 가득 찼을 때
        // offer == false
        // add == 예외
        queue.offer(1);
        queue.add(2);

        // dequeue
        // queue 가 비어있을 때
        // remove == null
        // poll == 예외 발생
        System.out.println(queue.remove()); // 1
        System.out.println(queue.poll()); // 2

        //peek
        // queue 가 비어있을 때
        // element == 예외 발생
        // peek == null
        System.out.println(queue.peek()); // null
        System.out.println(queue.element());

    }
}
