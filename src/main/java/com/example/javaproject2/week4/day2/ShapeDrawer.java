package com.example.javaproject2.week4.day2;

public abstract class ShapeDrawer {
    public abstract String makeALine(int h , int i); // 추상메소드. 하나라도 있다면 추상 클레스가 된다.
                                                    // 추상 메소드를 자식이 구현해야 사용할 수 있다.

    public void printPyramid(int h){
        for (int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
}
