package com.example.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point ();
        point1.x = 0;
        point1.y = 1;
        System.out.printf("x와 y가 같은가 ? = %b \n",point1.isSameXY());
        Point point2 = new Point ();
        point2.x = 0;
        point2.y = 0;
        System.out.printf("x와 y가 같은가 ? = %b \n",point2.isSameXY());
        Point point3 = new Point ();
        point3.x = 5;
        point3.y = Integer.parseInt("5");
        System.out.printf("x와 y가 같은가 ? = %b \n",point3.isSameXY());
        Point point4 = new Point ();
        point4.x = 5;
        point4.y = (int)(1.5 + 3.5);
        System.out.printf("x와 y가 같은가 ? = %b \n",point4.isSameXY());





    }
}
