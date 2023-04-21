package com.example.javaproject2.week1.day5;

public class DistanceBetweenTwoPoints {

    int x1 ;
    int y1 ;
    int x2 ;
    int y2;
    double c ;

    public void distancePrint(){
        c = Math.sqrt(( (x1 - x2) * (x1 - x2) ) + ( (y1 - y2) * (y1 - y2) ));
        System.out.printf(" 두 점 사이의 거리  = %.2f ", c);
    }
}
