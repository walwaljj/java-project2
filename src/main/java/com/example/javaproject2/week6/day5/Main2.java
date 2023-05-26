package com.example.javaproject2.week6.day5;

interface Shape {
    double calculateArea();

    default void display(){
        System.out.println("디폴트 메서드"); // 구현하지 않아도 사용가능하다.
    }
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
//        return radius * radius * 3.14 ;
        return Math.PI * radius * radius;
    }
}

public class Main2{
    public static void main(String[] args){
        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        circle.display();

    }
}
