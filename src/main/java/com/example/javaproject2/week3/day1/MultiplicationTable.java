package com.example.javaproject2.week3.day1;

public class MultiplicationTable {

    public static void main(String[] args) {
//
//        for (int i = 1; i <= 9; i++) {
//            System.out.printf("2 * %d = %d\n", i, i*2 );
//        }
//

        for (int i = 1; i <= 9; i ++ ) {
            for (int j = 2; j <= 4; j ++ ) {
                System.out.printf("%d * %d =%d      ", j, i , i * j);
            }
            System.out.println();
        }
    }
}
