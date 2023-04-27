package com.example.javaproject2.week2.day4;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        x += 1;
        System.out.printf("+=1 %d\n", x); //11
        x -= 5;
        System.out.printf("-=5 %d\n", x);//6
        x %= 4;
        System.out.printf("%%=3 %d\n", x);//2
        x *= 3;
        System.out.printf("*=3 %d\n", x);//6
        x /= 2;
        System.out.printf("/=2 %d\n", x);//3
    }
}
